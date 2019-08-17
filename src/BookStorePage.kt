import kotlin.browser.document
import org.w3c.dom.HTMLDivElement

class BookStorePage(private val presenter: BookStoreContract.Presenter) : BookStoreContract.View {
    private val loader = document.getElementById("loader") as HTMLDivElement
    private val content = document.getElementById("content") as HTMLDivElement
    private val cardBuilder = CardBuilder()

    override fun showBooks(books: List<Book>) {
        books.forEach { book ->
            val card = cardBuilder.build(book)
            content.appendChild(card)
        }
    }

    fun show() {
        presenter.attach(this)
        presenter.loadBooks()
    }

    override fun showLoader() {
        loader.style.visibility = "visible"
    }

    override fun hideLoader() {
        loader.style.visibility = "hidden"
    }
}