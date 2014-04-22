package com.acme.sbt.bom

import sbt._
import Keys._

object Resolvers {
  val mirror = "ACME Mirror" at "http://nexus.acme.com/content/groups/public"
  val releases = "ACME Releases" at "http://nexus.acme.com/content/repositories/acme-releases"
  val snapshots = "ACME Snapshots" at "http://nexus.acme.com/content/repositories/acme-snapshots"
  val thirdparty = "ACME 3rd Party" at "http://nexus.acme.com/content/repositories/acme-thirdparty"
  val allResolvers = Seq(releases, snapshots, thirdparty, mirror)
}

object Dependencies {

  // Versions
  object versions {
    val platform = "1.0.0-SNAPSHOT"

    val activemq = "5.9.0"
    val akka = "2.3.0"
    val ant = "1.9.3"
    val asm = "4.2"
    val aspectj = "1.7.4"
    val avro = "1.7.6"
    val batik = "1.6-1"
    val bouncycastle = "1.50"
    val camel = "2.13.0"
    val cglib = "3.1"
    val cucumber = "1.1.5"
    val cxf = "2.7.10"
    val freemarker = "2.3.20"
    val groovy = "2.2.2"
    val guice = "4.0-beta"
    val hibernate = "4.3.4.Final"
    val httpComponents = "4.3.3"
    val jackson = "2.3.2"
    val jackson1 = "1.9.12"
    val java = "1.8"
    val jencks = "2.2"
    val jersey1 = "1.18.1"
    val jersey = "2.6"
    val jetty = "9.1.2.v20140210"
    val jetty6 = "6.1.26"
    val json4s = "3.2.7"
    val junit = "4.11"
    val logback = "1.1.2"
    val lucene = "4.7.0"
    val metrics = "3.0.2"
    val netty = "4.0.17.Final"
    val powermock = "1.5.4"
    val scala = "2.10.4"
    val scalastyle = "0.4.0"
    val slf4j = "1.7.7"
    val spring = "4.0.3.RELEASE"
    val springIntegration = "3.0.1.RELEASE"
    val springSecurity = "3.2.1.RELEASE"
    val springSecurityOauth = "1.0.5.RELEASE"
    val swagger = "1.3.2"
    val testng = "6.8.8"
    val tomcat = "8.0.3"
    val yammerMetrics = "2.2.0"
  }




  val aopalliance = "aopalliance" % "aopalliance" % "1.0"

  val antlr = "antlr" % "antlr" % "2.7.7"
  val antlrStringTemplate = "antlr" % "stringtemplate" % "3.2.1"

  val asm = "asm" % "asm" % "3.3.1"
  val asmAttrs = "asm" % "asm-attrs" % "2.2.3"
  val asmCommons = "asm" % "asm-commons" % "3.3.1"
  val asmTree = "asm" % "asm-tree" % "3.3.1"
  val asmUtil = "asm" % "asm-util" % "3.3.1"

  val batik = "batik" % "batik" % "1.5"
  val batikBridge = "batik" % "batik-brdige" % "$BATIK_VERSION"
  val batikCss = "batik" % "batik-css" % "$BATIK_VERSION"
  val batikDom = "batik" % "batik-dom" % "$BATIK_VERSION"
  val batikExt = "batik" % "batik-ext" % "$BATIK_VERSION"
  val batikParser = "batik" % "batik-parser" % "$BATIK_VERSION"
  val batikRasterizer = "batik" % "batik-rasterizer" % "$BATIK_VERSION"
  val batikScript = "batik" % "batik-script" % "$BATIK_VERSION"
  val batikTranscoder = "batik" % "batik-transcoder" % "$BATIK_VERSION"
  val batikUtil = "batik" % "batik-util" % "$BATIK_VERSION"

  val bcmailJdk14 = "bouncycastle" % "bcmail-jdk14" % "138"
  val bcprovJdk14 = "bouncycastle" % "bcprov-jdk14" % "140"
  val bctspJdk14 = "bouncycastle" % "bctsp-jdk14" % "138"

  val c3p0 = "c3p0" % "c3p0" % "0.9.1.2"

  val cglib = "cglib" % "cglib" % "$CGLIB_VERSION"
  val cglibNodep = "cglib" % "cglib-nodep" % "$CGLIB_VERSION"

  val logbackClassic = "ch.qos.logback" % "logback-classic" % versions.logback
  val logbackCore = "ch.qos.logback" % "logback-core" % versions.logback

  val logbackMongodbAccess = "ch.qos.logback.contrib" % "logback-mongodb-access" % versions.logback
  val logbackMongodbClassic = "ch.qos.logback.contrib" % "logback-mongodb-classic" % versions.logback
  val logbackMongodbCore = "ch.qos.logback.contrib" % "logback-mongodb-core" % versions.logback
  val logbackJackson = "ch.qos.logback.contrib" % "logback-jackson" % versions.logback
  val logbackJsonClassic = "ch.qos.logback.contrib" % "logback-json-classic" % versions.logback
  val logbackJsonCore = "ch.qos.logback.contrib" % "logback-json-core" % versions.logback

  val awsJavaSdk = "com.amazonaws" % "aws-java-sdk" % "1.7.3"

  val metricsAnnotation = "com.codahale.metrics" % "metrics-annotation" % versions.metrics
  val metricsCore = "com.codahale.metrics" % "metrics-core" % versions.metrics
  val metricsEhcache = "com.codahale.metrics" % "metrics-ehcache" % versions.metrics
  val metricsGanglia = "com.codahale.metrics" % "metrics-ganglia" % versions.metrics
  val metricsGraphite = "com.codahale.metrics" % "metrics-graphite" % versions.metrics
  val metricsHealthchecks = "com.codahale.metrics" % "metrics-healthchecks" % versions.metrics
  val metricsHttpclient = "com.codahale.metrics" % "metrics-httpclient" % versions.metrics
  val metricsJdbi = "com.codahale.metrics" % "metrics-jdbi" % versions.metrics
  val metricsJersey = "com.codahale.metrics" % "metrics-jersey" % versions.metrics
  val metricsJetty8 = "com.codahale.metrics" % "metrics-jetty8" % versions.metrics
  val metricsJetty9 = "com.codahale.metrics" % "metrics-jetty9" % versions.metrics
  val metricsJson = "com.codahale.metrics" % "metrics-json" % versions.metrics
  val metricsJvm = "com.codahale.metrics" % "metrics-jvm" % versions.metrics
  val metricsLog4j = "com.codahale.metrics" % "metrics-log4j" % versions.metrics
  val metricsLogback = "com.codahale.metrics" % "metrics-logback" % versions.metrics
  val metricsServlet = "com.codahale.metrics" % "metrics-servlet" % versions.metrics
  val metricsServlets = "com.codahale.metrics" % "metrics-servlets" % versions.metrics


  val jacksonAnnotations = "com.fasterxml.jackson.core" % "jackson-annotations" % "$JACKSON_VERSION"
  val jacksonCore = "com.fasterxml.jackson.core" % "jackson-core" % "$JACKSON_VERSION"
  val jacksonDatabind = "com.fasterxml.jackson.core" % "jackson-databind" % "$JACKSON_VERSION"
  val jacksonDataformatXml = "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % "$JACKSON_VERSION"
  val jacksonDataformatYaml = "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % "$JACKSON_VERSION"
  val jacksonDatatypeGuava = "com.fasterxml.jackson.datatype" % "jackson-datatype-guava" % "$JACKSON_VERSION"
  val jacksonDatatypeHppc = "com.fasterxml.jackson.datatype" % "jackson-datatype-hppc" % "$JACKSON_VERSION"
  val jacksonDatatypeJoda = "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % "$JACKSON_VERSION"
  val jacksonDatatypeJsonOrg = "com.fasterxml.jackson.datatype" % "jackson-datatype-json-org" % "$JACKSON_VERSION"
  val jacksonDatatypeJsr353 = "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr353" % "$JACKSON_VERSION"
  val jacksonJaxrsBase = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-base" % "$JACKSON_VERSION"
  val jacksonJaxrsJsonProvider = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % "$JACKSON_VERSION"
  val jacksonJaxrsSmileProvider = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-smile-provider" % "$JACKSON_VERSION"
  val jacksonJaxrsXmlProvider = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-xml-provider" % "$JACKSON_VERSION"
  val jacksonModuleJaxbAnnotations = "com.fasterxml.jackson.module" % "jackson-module-jaxb-annotations" % "$JACKSON_VERSION"
  val jacksonModuleAfterburner = "com.fasterxml.jackson.module" % "jackson-module-afterburner" % "$JACKSON_VERSION"

  val slugify = "com.github.slugify" % "slugify" % "2.1.2"

  val googleCollections = "com.google.collections" % "google-collections" % "1.0"

  val guava = "com.google.guava" % "guava" % "16.0.1"

  val guice = "com.google.inject" % "guice" % "$GUICE_VERSION"
  val guiceAssistedInject = "com.google.inject.extensions" % "guice-assistedinject" % "$GUICE_VERSION"
  val guiceJmx = "com.google.inject.extensions" % "guice-jmx" % "$GUICE_VERSION"
  val guiceJndi = "com.google.inject.extensions" % "guice-jndi" % "$GUICE_VERSION"
  val guiceMultibindings = "com.google.inject.extensions" % "guice-multibindings" % "$GUICE_VERSION"
  val guiceServlet = "com.google.inject.extensions" % "guice-servlet" % "$GUICE_VERSION"

  val findbugs = "com.google.code.findbugs" % "findbugs" % "2.0.3"
  val findbugsAnnotations = "com.google.code.findbugs" % "findbugs-annotations" % "2.0.3"
  val findbugsJsr305 = "com.google.code.findbugs" % "jsr305" % "2.0.3"

  val jsonSimple = "com.googlecode.json-simple" % "json-simple" % "1.1.1"
  
  val pojosr = "com.googlecode.pojosr" % "de.kalpatec.pojosr.framework" % "0.2.1"

  val hazelcast = "com.hazelcast" % "hazelcast" % "3.1.6"

  val jsch = "com.jcraft" % "jsch" % "0.1.50"
  
  val itext = "com.lowagie" % "itext" % "4.2.1"
  
  val c3p0 = "com.mchange" % "c3p0" % "0.9.2.1"
  
  val base64 = "com.mindprod" % "base64" % "1.6"
  
  val mockrunnerJdbc = "com.mockrunner" % "mockrunner-jdbc" % "1.0.0"

  val checkstyle = "com.puppycrawl.tools" % "checkstyle" % "5.7"

  val rabbitmqAmqpClient = "com.rabbitmq" % "amqp-client" % "3.2.4"

  val jersey1Client = "com.sun.jersey" % "jersey-client" % "$JERSEY_ONE_VERSION"
  val jersey1Core = "com.sun.jersey" % "jersey-core" % "$JERSEY_ONE_VERSION"
  val jersey1Server = "com.sun.jersey" % "jersey-server" % "$JERSEY_ONE_VERSION"
  val jersey1Servlet = "com.sun.jersey" % "jersey-servlet" % "$JERSEY_ONE_VERSION"

  val jersey1Guice = "com.sun.jersey.contribs" % "jersey-guice" % "$JERSEY_ONE_VERSION"
  val jersey1Mulitpart = "com.sun.jersey.contribs" % "jersey-multipart" % "$JERSEY_ONE_VERSION"
  val jersey1Spring = "com.sun.jersey.contribs" % "jersey-spring" % "$JERSEY_ONE_VERSION"

  val jersey1OauthClient = "com.sun.jersey.contribs.jersey-oauth" % "oauth-client" % "$JERSEY_ONE_VERSION"
  val jersey1OauthSignature = "com.sun.jersey.contribs.jersey-oauth" % "oauth-signature" % "$JERSEY_ONE_VERSION"
  val jersey1OauthServer = "com.sun.jersey.contribs.jersey-oauth" % "oauth-server" % "$JERSEY_ONE_VERSION"

  val jaxbImpl = "com.sun.xml.bind" % "jaxb-impl" % "2.2.8-b01"
  val jaxbXjc = "com.sun.xml.bind" % "jaxb-xjc" % "2.2.8-b01"

  val paranamer = "com.thoughtworks.paranamer" % "paranamer" % "2.6"
  val xstream = "com.thoughtworks.xstream" % "xstream" % "1.4.7"

  val akkaActor = "com.typesafe.akka" % "akka-actor" % "$AKKA_VERSION"
  val akkaRemote = "com.typesafe.akka" % "akka-remote" % "$AKKA_VERSION"
  val akkaSlf4j = "com.typesafe.akka" % "akka-slf4j" % "$AKKA_VERSION"

  val proweb = "com.qas" % "proweb" % "4.0"

  val swaggerAnnotations = "com.wordnik" %% "swagger-annotations" % "$SWAGGER_VERSION"
  val swaggerCore = "com.wordnik" %% "swagger-core" % "$SWAGGER_VERSION"
  val swaggerJaxrs = "com.wordnik" %% "swagger-jaxrs" % "$SWAGGER_VERSION"
  val swaggerJerseyJaxrs = "com.wordnik" %% "swagger-jersey-jaxrs" % "$SWAGGER_VERSION"
  val swaggerJersey2Jaxrs = "com.wordnik" %% "swagger-jersey2-jaxrs" % "$SWAGGER_VERSION"
  val swaggerOauth2Server = "com.wordnik" %% "swagger-oauth2-server" % "$SWAGGER_VERSION"
  val swaggerScalaServlet = "com.wordnik" %% "swagger-scala-servlet" % "$SWAGGER_VERSION"
  val swaggerServlet = "com.wordnik" %% "swagger-servlet" % "$SWAGGER_VERSION"

  val yammerMetricsAnnotation = "com.yammer.metrics" % "metrics-annotation" % versions.yammerMetrics
  val yammerMetricsCore = "com.yammer.metrics" % "metrics-core" % versions.yammerMetrics
  val yammerMetricEhcache = "com.yammer.metrics" % "metrics-ehcache" % versions.yammerMetrics
  val yammerMetricsGuice = "com.yammer.metrics" % "metrics-guice" % versions.yammerMetrics
  val yammerMetricsJersey = "com.yammer.metrics" % "metrics-jersey" % versions.yammerMetrics
  val yammerMetricsServlet = "com.yammer.metrics" % "metrics-servlet" % versions.yammerMetrics
  val yammerMetricsSpring = "com.yammer.metrics" % "metrics-spring" % versions.yammerMetrics
  val yammerMetricsWeb = "com.yammer.metrics" % "metrics-web" % versions.yammerMetrics

  val commonsBeanutils = "commons-beanutils" % "commons-beanutils" % "1.9.1"
  val commonsCli = "commons-cli" % "commons-cli" % "1.2"
  val commonsCodec = "commons-codec" % "commons-codec" % "1.9"
  val commonsCollections = "commons-collections" % "commons-collections" % "3.2.1"
  val commonsDaemon = "commons-daemon" % "commons-daemon" % "1.0.15"
  val commonsDbcp = "commons-dbcp" % "commons-dbcp" % "1.4"
  val commonsDigester = "commons-digester" % "commons-digester" % "2.1"
  val commonsFileupload = "commons-fileupload" % "commons-fileupload" %"1.3.1"
  val commonsHttpclient = "commons-httpclient" % "commons-httpclient" % "3.1"
  val commonsIo = "commons-io" % "commons-io" % "2.4"
  val commonsLang = "commons-lang" % "commons-lang" % "2.6"
  val commonsLogging = "commons-logging" % "commons-logging" % "1.1.3"
  val commonsLoggingApi = "commons-logging" % "commons-logging-api" % "1.1"
  val commonsPool = "commons-pool" % "commons-pool" % "1.6"
  val commonsNet = "commons-net" % "commons-net" % "3.3"

  val dom4j = "dom4j" % "dom4j" % "1.6.1"
  val freemarker = "freemarker" % "freemarker" % "2.3.15"

  val cucumberAndroid = "info.cukes" % "cucumber-android" % versions.cucumber
  val cucumberClojure = "info.cukes" % "cucumber-clojure" % versions.cucumber
  val cucumberCore = "info.cukes" % "cucumber-core" % versions.cucumber
  val cucumberGroovy = "info.cukes" % "cucumber-groovy" % versions.cucumber
  val cucumberGuice = "info.cukes" % "cucumber-guice" % versions.cucumber
  val cucumberIoke = "info.cukes" % "cucumber-ioke" % versions.cucumber
  val cucumberJava = "info.cukes" % "cucumber-java" % versions.cucumber
  val cucumberJruby = "info.cukes" % "cucumber-jruby" % versions.cucumber
  val cucumberJunit = "info.cukes" % "cucumber-junit" % versions.cucumber
  val cucumberJython = "info.cukes" % "cucumber-jython" % versions.cucumber
  val cucumberNeedle = "info.cukes" % "cucumber-needle" % versions.cucumber
  val cucumberOpenejb = "info.cukes" % "cucumber-openejb" % versions.cucumber
  val cucumberPicocontainer = "info.cukes" % "cucumber-picocontainer" % versions.cucumber
  val cucumberScala = "info.cukes" % "cucumber-scala" % versions.cucumber
  val cucumberSpring = "info.cukes" % "cucumber-spring" % versions.cucumber
  val cucumberWEld = "info.cukes" % "cucumber-weld" % versions.cucumber

  val nettyAll = "io.netty" % "netty-all" % "$NETTY_VERSION"
  val nettyExample = "io.netty" % "netty-example" % "$NETTY_VERSION"
  val nettyHandler = "io.netty" % "netty-handler" % "$NETTY_VERSION"
  val nettyCodec = "io.netty" % "netty-codec" % "$NETTY_VERSION"
  val nettyTransport = "io.netty" % "netty-transport" % "$NETTY_VERSION"
  val nettyBugger = "io.netty" % "netty-buffer" % "$NETTY_VERSION"
  val nettyCommon = "io.netty" % "netty-common" % "$NETTY_VERSION"

  val javassist = "javassist" % "javassist" % "3.12.1.GA"

  val activation = "javax.activation" % "activation" % "1.1.1"

  val jsr250Api = "javax.annotation" % "jsr250-api" % "1.0"
  val javaxAnnotationApi = "javax.annotation" % "javax.annotation-api" % "1.2"

  val javaxCacheApi = "javax.cache" % "cache-api" % "1.0.0-RC1"

  val elApi = "javax.el" % "el-api" % "2.2"
  val javaxElApi = "javax.el" % "javax.el-api" % "3.0.0"

  val javaxInject = "javax.inject" % "javax.inject" % "1"

  val j2ee = "javax.j2ee" % "j2ee" % "1.5"
  val jms = "javax.jms" % "jms" % "1.1"

  val mail = "javax.mail" % "mail" % "1.4.7"
  val javaxMailApi = "javax.mail" % "javax.mail-api" % "1.5.1"

  val persistenceApi = "javax.persistence" % "persistence-api" % "1.0.2"
  val jsr94 = "javax.rules" % "jsr94" % "1.1"

  val servletApi = "javax.servlet" % "servlet-api" % "2.5"
  val javaxServletApi = "javax.servlet" % "javax.servlet-api" % "3.1.0"
  val jstl = "javax.servlet" % "jstl" % "1.2"
  val jspApi = "javax.servlet.jsp" % "jsp-api" % "2.2.1"
  val jstlApi = "javax.servlet.jsp.jstl" % "jstl-api" % "1.2"

  val jta = "javax.transaction" % "jta" % "1.1"
  val validationApi = "javax.validation" % "validation-api" % "1.1.0.Final"

  val jsr311Api = "javax.ws.rs" % "jsr311-api" % "1.1.1"
  val javaxWsRsApi = "javax.ws.rs" % "javax.ws.rs-api" % "2.0-m10"

  val jsr173 = "javax.xml" % "jsr173" % "1.0"
  val jaxbApi = "javax.xml.bind" % "jaxb-api" % "2.2.11"
  val staxApi = "javax.xml.stream" % "stax-api" % "1.0-2"

  val jaxen = "jaxen" % "jaxen" % "1.1.4"

  val jdepend = "jdepend" % "jdepend" % "2.9.1"

  val jline = "jline" % "jline" % "2.11"

  val jodaTime = "joda-time" % "joda-time" % "2.3"

  val junit = "junit" % "junit" % "4.11"

  val jxl = "jxl" % "jxl" % "2.6.10"

  val log4j = "log4j" % "log4j" % "1.2.17"
  val log4jExtras = "log4j" % "apache-log4j-extras" % "1.2.17"

  val mysqlConnectorJava = "mysql" % "mysql-connector-java" % "5.1.29"

  val jerichoHtml = "net.htmlparser.jericho" % "jericho-html" % "3.3"

  val ehcache = "net.sf.ehcache" % "ehcache" % "2.8.1"
  
  val flexjson = "net.sf.flexjson" % "flexjson" % "3.2"

  val cobertura = "net.sourceforge.cobertura" % "cobertura" % "2.0.3"
  
  val saxon = "net.sourceforge.saxon" % "saxon" % "9.1.0.8"

  val ognl = "ognl" % "ognl" % "3.0.8"

  val opencsv = "opencsv" % "opencsv" % "1.8"

  val antlr = "org.antlr" % "antlr" % "3.5.1"
  val antlrStringtemplate = "org.antlr" % "stringtemplate" % "4.0.2"

  val jakartaOro = "org.apache" % "jakarta-oro" % "2.0.8"

  val activemqAll = "org.apache.activemq" % "activemq-all" % versions.activemq
  val activemqCamel = "org.apache.activemq" % "activemq-camel" % versions.activemq
  val activemqPool = "org.apache.activemq" % "activemq-pool" % versions.activemq

  val ant = "org.apache.ant" % "ant" % versions.ant
  val antLauncher = "org.apache.ant" % "ant-launcher" % versions.ant

  val avro = "org.apache.avro" % "avro" % versions.avro
  val avroIpc = "org.apache.avro" % "avro-ipc" % versions.avro

  val bsfAll = "org.apache.bsf" % "bsf-all" % "3.0-beta3"

  val camelAws = "org.apache.camel" % "camel-aws" % versions.camel
  val camelBeanValidator = "org.apache.camel" % "camel-bean-validator" % versions.camel
  val camelBindy = "org.apache.camel" % "camel-bindy" % versions.camel
  val camelCache = "org.apache.camel" % "camel-cache" % versions.camel
  val camelCore = "org.apache.camel" % "camel-core" % versions.camel
  val camelCoreXml = "org.apache.camel" % "camel-core-xml" % versions.camel
  val camelCsv = "org.apache.camel" % "camel-csv" % versions.camel
  val camelCxf = "org.apache.camel" % "camel-cxf" % versions.camel
  val camelCxfTransport = "org.apache.camel" % "camel-cxf-transport" % versions.camel
  val camelDozer = "org.apache.camel" % "camel-dozer" % versions.camel
  val camelEclipse = "org.apache.camel" % "camel-eclipse" % versions.camel
  val camelFtp = "org.apache.camel" % "camel-ftp" % versions.camel
  val camelHttp4 = "org.apache.camel" % "camel-http4" % versions.camel
  val camelJackson = "org.apache.camel" % "camel-jackson" % versions.camel
  val camelJaxb = "org.apache.camel" % "camel-jaxb" % versions.camel
  val camelJdbc = "org.apache.camel" % "camel-jdbc" % versions.camel
  val camelJms = "org.apache.camel" % "camel-jms" % versions.camel
  val camelJpa = "org.apache.camel" % "camel-jpa" % versions.camel
  val camelLucene = "org.apache.camel" % "camel-lucene" % versions.camel
  val camelMail = "org.apache.camel" % "camel-mail" % versions.camel
  val camelMongodb = "org.apache.camel" % "camel-mongodb" % versions.camel
  val camelQuartz = "org.apache.camel" % "camel-quartz" % versions.camel
  val camelRabbitmq = "org.apache.camel" % "camel-rabbitmq" % versions.camel
  val camelScala = "org.apache.camel" % "camel-scala" % versions.camel
  val camelScript = "org.apache.camel" % "camel-script" % versions.camel
  val camelSmpp = "org.apache.camel" % "camel-smpp" % versions.camel
  val camelSolr = "org.apache.camel" % "camel-solr" % versions.camel
  val camelSpring = "org.apache.camel" % "camel-spring" % versions.camel
  val camelTest = "org.apache.camel" % "camel-test" % versions.camel
  val camelTestng = "org.apache.camel" % "camel-testng" % versions.camel
  val camelVelocity = "org.apache.camel" % "camel-velocity" % versions.camel
  val camelWeb = "org.apache.camel" % "camel-web" % versions.camel
  val camelWebsocket = "org.apache.camel" % "camel-websocket" % versions.camel
  val camelXmljson = "org.apache.camel" % "camel-xmljson" % versions.camel
  val camelXmpp = "org.apache.camel" % "camel-xmpp" % versions.camel
  val camelXstream = "org.apache.camel" % "camel-xstream" % versions.camel
  val camelZookeeper = "org.apache.camel" % "camel-zookeeper" % versions.camel

  val commonsLang3 = "org.apache.commons" % "commons-lang3" % "3.3"
  val commonsMath3 = "org.apache.commons" % "commons-math3" % "3.2"

  val cxfApi = "org.apache.cxf" % "cxf-api" % versions.cxf
  val cxfBundle = "org.apache.cxf" % "cxf-bundle" % versions.cxf
  val cxfRtBindingsSoap = "org.apache.cxf" % "cxf-rt-bindings-soap" % versions.cxf
  val cxfRtBindingsXml = "org.apache.cxf" % "cxf-rt-bindings-xml" % versions.cxf
  val cxfRtCore = "org.apache.cxf" % "cxf-rt-core" % versions.cxf
  val cxfRtDatabindingJaxb = "org.apache.cxf" % "cxf-rt-databinding-jaxb" % versions.cxf
  val cxfRtFrontendJaxrs = "org.apache.cxf" % "cxf-rt-frontend-jaxrs" % versions.cxf
  val cxfRtFrontendJaxws = "org.apache.cxf" % "cxf-rt-frontend-jaxws" % versions.cxf
  val cxfRtFrontendSimple = "org.apache.cxf" % "cxf-rt-frontend-simple" % versions.cxf
  val cxfRtRsExtensionProviders = "org.apache.cxf" % "cxf-rt-rs-extension-providers" % versions.cxf
  val cxfRtRsExtensionSearch = "org.apache.cxf" % "cxf-rt-rs-extension-search" % versions.cxf
  val cxfRtRsSecurityCors = "org.apache.cxf" % "cxf-rt-rs-security-cors" % versions.cxf
  val cxfRtRsSecurityOauth2 = "org.apache.cxf" % "cxf-rt-rs-security-oauth2" % versions.cxf
  val cxfRtTransportsHttp = "org.apache.cxf" % "cxf-rt-transports-http" % versions.cxf
  val cxfRtTransportsHttpJetty = "org.apache.cxf" % "cxf-rt-transports-http-jetty" % versions.cxf
  val cxfRtWsAddr = "org.apache.cxf" % "cxf-rt-ws-addr" % versions.cxf
  val cxfTestutils = "org.apache.cxf" % "cxf-testutils" % versions.cxf
  val cxfSystestsJaxrs = "org.apache.cxf.systests" % "cxf-systests-jaxrs" % versions.cxf

  val geronimoAnnotation10Spec = "org.apache.geronimo.specs" % "geronimo-annotation_1.0_spec" % "1.1.1"
  val geronimoJ2ee11Spec = "org.apache.geronimo.specs" % "geronimo-j2ee-management_1.1_spec" % "1.0.1"
  val geronimoJaspic10Spec = "org.apache.geronimo.specs" % "geronimo-jaspic_1.0_spec" % "1.1"
  val geronimoJms11Spec = "org.apache.geronimo.specs" % "geronimo-jms_1.1_spec" % "1.1.1"
  val geronimoJta101BSpec = "org.apache.geronimo.specs" % "geronimo-jta_1.0.1B_spec" % "1.1.1"
  val geronimoJta11Spec = "org.apache.geronimo.specs" % "geronimo-jta_1.1_spec" % "1.1.1"
  val geronimoServlet25Spec = "org.apache.geronimo.specs" % "geronimo-servlet_2.5_spec" % "1.2"
  val geronimoServlet30Spec = "org.apache.geronimo.specs" % "geronimo-servlet_3.0_spec" % "1.0"
  val geronimoStaxApi10Spec = "org.apache.geronimo.specs" % "geronimo-stax-api_1.0_spec" % "1.0.1"

  val httpclient = "org.apache.httpcomponents" % "httpclient" % versions.httpComponents
  val httpclientCache = "org.apache.httpcomponents" % "httpclient-cache" % versions.httpComponents
  val httpcore = "org.apache.httpcomponents" % "httpcore" % "4.3.2"
  val httpmime = "org.apache.httpcomponents" % "httpmime" % versions.httpComponents

  val log4j2 = "org.apache.logging.log4j" % "log4j" % "2.0-rc1"

  val lucenceAnalyzersCommon = "org.apache.lucene" % "lucene-analyzers-common" % versions.lucene
  val lucenceCore = "org.apache.lucene" % "lucene-core" % versions.lucene

  val tomcat = "org.apache.tomcat" % "tomcat" % versions.tomcat

  val xbeanSpring = "org.apache.xbean" % "xbean-spring" % "3.16"
  val xmlbeans = "org.apache.xmlbeans" % "xmlbeans" % "2.5.0"

  val aspectjrt = "org.aspectj" % "aspectjrt" % versions.aspectj
  val aspectjtools = "org.aspectj" % "aspectjtools" % versions.aspectj
  val aspectjweaver = "org.aspectj" % "aspectjweaver" % versions.aspectj

  val bcmailJdk14 = "org.bouncycastle" % "bcmail-jdk14" % versions.bouncycastle
  val bcpgJdk14 = "org.bouncycastle" % "bcpg-jdk14" % versions.bouncycastle
  val bcpkixJdk14 = "org.bouncycastle" % "bcpkix-jdk14" % versions.bouncycastle
  val bcprovJdk14 = "org.bouncycastle" % "bcprov-jdk14" % versions.bouncycastle
  val bcprovExtJdk14 = "org.bouncycastle" % "bcprov-ext-jdk14" % versions.bouncycastle
  val bcmailJdk15on = "org.bouncycastle" % "bcmail-jdk15on" % versions.bouncycastle
  val bcpgJdk15on = "org.bouncycastle" % "bcpg-jdk15on" % versions.bouncycastle
  val bcpkixJdk145on = "org.bouncycastle" % "bcpkix-jdk145on" % versions.bouncycastle
  val bcprovJdk15on = "org.bouncycastle" % "bcprov-jdk15on" % versions.bouncycastle
  val bcprovExtJdk15on = "org.bouncycastle" % "bcprov-ext-jdk15on" % versions.bouncycastle

  val enunciateCoreAnnotations = "org.codehaus.enunciate" % "enunciate-core-annotations" % "1.28"

  val groovy = "org.codehaus.groovy" % "groovy" % "2.2.2"
  val groovyAll = "org.codehaus.groovy" % "groovy-all" % "2.2.2"

  val jackson1CoreAsl = "org.codehaus.jackson" % "jackson-core-asl" % versions.jackson1
  val jackson1Jaxrs = "org.codehaus.jackson" % "jackson-jaxrs" % versions.jackson1
  val jackson1MapperAsl = "org.codehaus.jackson" % "jackson-mapper-asl" % versions.jackson1
  val jackson1Xc = "org.codehaus.jackson" % "jackson-xc" % versions.jackson1

  val jettison = "org.codehaus.jettison" % "jettison" % "1.3.5"

  val easymock = "org.easymock" % "easymock" % "3.2"

  val jettyAnt = "org.eclipse.jetty" % "jetty-ant" % versions.jetty
  val jettyDistribution = "org.eclipse.jetty" % "jetty-distribution" % versions.jetty
  val jettyServer = "org.eclipse.jetty" % "jetty-server" % versions.jetty

  val eclipseLink = "org.eclipse.persistence" % "eclipselink" % "2.5.1"
  val javaxPersistence = "org.eclipse.persistence" % "javax.persistence" % "2.1.0"

  val freemarker = "org.freemarker" % "freemarker" % versions.freemarker
  val freemarkerGae = "org.freemarker" % "freemarker-gae" % versions.freemarker

  val jerseyJettyConnector = "org.glassfish.jersey.connector" % "jersey-jetty-connector" % versions.jersey

  val jerseyClient = "org.glassfish.jersey.core" % "jersey-client" % versions.jersey
  val jerseyCommon = "org.glassfish.jersey.core" % "jersey-common" % versions.jersey
  val jerseyServer = "org.glassfish.jersey.core" % "jersey-server" % versions.jersey

  val jerseyBeanValidation = "org.glassfish.jersey.ext" % "jersey-bean-validation" % versions.jersey
  val jerseyDeclarativeLinking = "org.glassfish.jersey.media" % "jersey-declarative-linking" % versions.jersey
  val jerseySpring3 = "org.glassfish.jersey.media" % "jersey-spring3" % versions.jersey

  val jerseyMediaJson = "org.glassfish.jersey.media" % "jersey-media-json" % versions.jersey
  val jerseyMediaJsonJackson = "org.glassfish.jersey.media" % "jersey-media-json-jackson" % versions.jersey
  val jerseyMediaJsonJettison = "org.glassfish.jersey.media" % "jersey-media-json-jettison" % versions.jersey
  val jerseyMediaMultipart = "org.glassfish.jersey.media" % "jersey-media-multipart" % versions.jersey

  val jerseyOauth2Client = "org.glassfish.jersey.security" % "oauth2-client" % versions.jersey

  val hibernateC3p0 = "org.hibernate" % "hibernate-c3p0" % versions.hibernate
  val hibernateCore = "org.hibernate" % "hibernate-core" % versions.hibernate
  val hibernateEhcache = "org.hibernate" % "hibernate-ehcache" % versions.hibernate
  val hibernateEntitymanager = "org.hibernate" % "hibernate-entitymanager" % versions.hibernate
  val hibernateSearch = "org.hibernate" % "hibernate-search" % "4.5.0.Final"
  val hibernateValidator = "org.hibernate" % "hibernate-validator" % "5.1.0.Final"

  val hsqldb = "org.hsqldb" % "hsqldb" % "2.3.2"

  val jdom = "org.jdom" % "jdom" % "2.0.2"

  val jencks = "org.jencks" % "jencks" % versions.jencks
  val jencksAmqpool = "org.jencks" % "jencks-amqpool" % versions.jencks

  val json4sJackson = "org.json4s" %% "json4s-jackson" % versions.json4s
  val json4sNative = "org.json4s" %% "json4s-native" % versions.json4s

  val annox = "org.jvnet.annox" % "annox" % "0.5.1"

  val jetty6 = "org.mortbay.jetty" % "jetty" % versions.jetty6
  val jettyManagement6 = "org.mortbay.jetty" % "jetty-management" % versions.jetty6
  val jettyUtil6 = "org.mortbay.jetty" % "jetty-util" % versions.jetty6

  val mybatis = "org.mybatis" % "mybatis" %"3.2.5"
  val mybatisEhcache = "org.mybatis" % "mybatis-ehcache" %"1.0.0"
  val mybatisGuice = "org.mybatis" % "mybatis-guice" %"3.5"
  val mybatisSpring = "org.mybatis" % "mybatis-spring" %"1.2.2"

  val mockitoAll = "org.mockito" % "mockito-all" % "1.9.5"
  
  val mongoJavaDriver = "org.mongodb" % "mongo-java-driver" % "2.11.4"
  
  val mvel2 = "org.mvel" % "mvel2" % "2.1.9.Final"
  
  val objenesis = "org.objenesis" % "objenesis" % "2.1"
  
  val ostermillerUtils = "org.ostermiller" % "utils" % "1.07.00"

  val asm = "org.ow2.asm" % "asm" % versions.asm
  val asmDebugAll = "org.ow2.asm" % "asm-debug-all" % versions.asm
  val asmAll = "org.ow2.asm" % "asm-all" % versions.asm
  val asmXml = "org.ow2.asm" % "asm-xml" % versions.asm
  val asmUtil = "org.ow2.asm" % "asm-util" % versions.asm
  val asmTree = "org.ow2.asm" % "asm-tree" % versions.asm
  val asmCommons = "org.ow2.asm" % "asm-commons" % versions.asm
  val asmAnalysis = "org.ow2.asm" % "asm-analysis" % versions.asm

  val powermockApi = "org.powermock" % "powermock-api" % versions.powermock
  val powermockCore = "org.powermock" % "powermock-core" % versions.powermock
  val powermockModuleJunit4 = "org.powermock" % "powermock-module-junit4" % versions.powermock
  val powermockModuleJunit4Common = "org.powermock" % "powermock-module-junit4-common" % versions.powermock
  val powermockModuleTesting = "org.powermock" % "powermock-module-testng" % versions.powermock
  val powermockModuleTestngCommon = "org.powermock" % "powermock-module-testng-common" % versions.powermock
  val powermockEasymockReleaseFull = "org.powermock" % "powermock-easymock-release-full" % versions.powermock
  val powermockMockitoReleaseFull = "org.powermock" % "powermock-mockito-release-full" % versions.powermock

  val quartz = "org.quartz-scheduler" % "quartz" % "2.2.1"

  val scalaLibrary = "org.scala-lang" % "scala-library" %versions.scala
  val scalaReflect = "org.scala-lang" % "scala-reflect" %versions.scala
  val scalap = "org.scala-lang" % "scalap" %versions.scala

  val scalastyle = "org.scalastyle" %% "scalastyle" % versions.scalastyle

  val jclOverSlf4j = "org.slf4j" % "jcl-over-slf4j" % versions.slf4j

  val slf4jAndroid = "org.slf4j" % "slf4j-android" % versions.slf4j
  val slf4jApi = "org.slf4j" % "slf4j-api" % versions.slf4j
  val slf4jExt = "org.slf4j" % "slf4j-ext" % versions.slf4j
  val slf4jJcl = "org.slf4j" % "slf4j-jcl" % versions.slf4j
  val slf4jLog4j12 = "org.slf4j" % "slf4j-log4j12" % versions.slf4j
  val slf4jSimple = "org.slf4j" % "slf4j-simple" % versions.slf4j

  val springAop = "org.springframework" % "spring-aop" % versions.spring
  val springAsm = "org.springframework" % "spring-asm" % versions.spring
  val springAspects = "org.springframework" % "spring-aspects" % versions.spring
  val springBeans = "org.springframework" % "spring-beans" % versions.spring
  val springContext = "org.springframework" % "spring-context" % versions.spring
  val springContextSupport = "org.springframework" % "spring-context-support" % versions.spring
  val springCore = "org.springframework" % "spring-core" % versions.spring
  val springExpression = "org.springframework" % "spring-expression" % versions.spring
  val springInstrument = "org.springframework" % "spring-instrument" % versions.spring
  val springJdbc = "org.springframework" % "spring-jdbc" % versions.spring
  val springJms = "org.springframework" % "spring-jms" % versions.spring
  val springOrm = "org.springframework" % "spring-orm" % versions.spring
  val springOxm = "org.springframework" % "spring-oxm" % versions.spring
  val springTest = "org.springframework" % "spring-test" % versions.spring
  val springTx = "org.springframework" % "spring-tx" % versions.spring
  val springWeb = "org.springframework" % "spring-web" % versions.spring
  val springWebmvc = "org.springframework" % "spring-webmvc" % versions.spring

  val springIntegrationCore = "org.springframework.integration" % "spring-integration-core" % versions.springIntegration
  val springIntegrationEvent = "org.springframework.integration" % "spring-integration-event" % versions.springIntegration
  val springIntegrationFile = "org.springframework.integration" % "spring-integration-file" % versions.springIntegration
  val springIntegrationHttp = "org.springframework.integration" % "spring-integration-http" % versions.springIntegration
  val springIntegrationJms = "org.springframework.integration" % "spring-integration-jms" % versions.springIntegration
  val springIntegrationMail = "org.springframework.integration" % "spring-integration-mail" % versions.springIntegration
  val springIntegrationRmi = "org.springframework.integration" % "spring-integration-rmi" % versions.springIntegration
  val springIntegrationSecurity = "org.springframework.integration" % "spring-integration-security" % versions.springIntegration
  val springIntegrationStream = "org.springframework.integration" % "spring-integration-stream" % versions.springIntegration
  val springIntegrationWs = "org.springframework.integration" % "spring-integration-ws" % versions.springIntegration
  val springIntegrationXml = "org.springframework.integration" % "spring-integration-xml" % versions.springIntegration

  val springSecurityAcl = "org.springframework.security" % "spring-security-acl" % versions.springSecurity
  val springSecurityCas = "org.springframework.security" % "spring-security-cas" % versions.springSecurity
  val springSecurityConfig = "org.springframework.security" % "spring-security-config" % versions.springSecurity
  val springSecurityCore = "org.springframework.security" % "spring-security-core" % versions.springSecurity
  val springSecurityCrypto = "org.springframework.security" % "spring-security-crypto" % versions.springSecurity
  val springSecurityLdap = "org.springframework.security" % "spring-security-ldap" % versions.springSecurity
  val springSecurityOpenId = "org.springframework.security" % "spring-security-openid" % versions.springSecurity
  val springSecurityWeb = "org.springframework.security" % "spring-security-web" % versions.springSecurity

  val springSecurityOauth2 = "org.springframework.security.oauth" % "spring-security-oauth2" % versions.springSecurityOauth

  val testng = "org.testng" % "testng" % "6.8.8"

  val snakeYaml = "org.yaml" % "snakeyaml" % "1.13"

  val staxApi = "stax" % "stax-api" % "1.0.1"

  val taglibsStandard = "taglibs" % "standard" % "1.1.2"

  val xalan = "xalan" % "xalan" % "2.7.1"

  val xerces = "xerces" % "xerces" % "2.4.0"
  val xercesImpl = "xerces" % "xercesImpl" % "2.11.0"

  val xmlApis = "xml-apis" % "xml-apis" % "1.4.01"

  val xmlunit = "xmlunit" % "xmlunit" % "1.5"

  val xom = "xom" % "xom" % "1.2.5"

  val xpp3min = "xpp3_min" % "xpp3_min" % "1.1.4c"
}

object Settings {

  import Resolvers._
  import Dependencies.versions

  val defaultSettings = Defaults.coreDefaultSettings ++ Seq(
    scalaVersion := versions.scala,
    resolvers := allResolvers,
    scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked", "-feature"),
    scalacOptions in(Compile, doc) ++= Seq("-external-urls:scala=http://www.scala-lang.org/api/current/", "-no-link-warnings"),
    javacOptions ++= Seq("-encoding", "UTF-8", "-source", versions.java, "-target", versions.java, "-Xlint:all"),
    publishMavenStyle := true,
    publishTo <<= version {
      (v: String) =>
        if (v.trim.endsWith("SNAPSHOT"))
          Some(snapshots)
        else
          Some(releases)
    },
    credentials += Credentials(Path.userHome / ".ivy2" / ".auth-acme"),
    organizationName := "ACME Inc.",
    organizationHomepage := Some(url("http://www.acme.com"))
  )
}
