fun main(args: Array<String>) {
    val bookStorePresenter = BookStorePresenter()
    val bookStorePage = BookStorePage(bookStorePresenter)
    bookStorePresenter.attach(bookStorePage)
    bookStorePresenter.loadBooks()
}

val API_URL = js("getApiUrl()") as String
