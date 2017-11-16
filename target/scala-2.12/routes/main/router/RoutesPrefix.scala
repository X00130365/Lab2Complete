
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/playLabs2017-Lab2-master/playLabs2017-Lab2-master/conf/routes
// @DATE:Thu Nov 09 12:11:02 GMT 2017


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
