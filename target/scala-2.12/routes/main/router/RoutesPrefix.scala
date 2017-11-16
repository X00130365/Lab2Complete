
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/1ab2/conf/routes
// @DATE:Thu Nov 16 13:24:51 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
