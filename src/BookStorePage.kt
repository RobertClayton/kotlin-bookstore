import kotlin.browser.document
import org.w3c.dom.HTMLDivElement

class BookStorePage(private val presenter: BookStoreContract.Presenter) : BookStoreContract.View {
    private val loader = document.getElementById("loader") as HTMLDivElement
    private val content = document.getElementById("content") as HTMLDivElement

    override fun showBooks(books: List<Book>) {}

    override fun showLoader() {
        loader.style.visibility = "visible"
    }

    override fun hideLoader() {
        loader.style.visibility = "hidden"
    }
}