package com.github.baleio.sbt.bom

import sbt._
import Keys._

object Resolvers {
  val mirror = "Baleio Mirror" at "http://nexus.bale.io/content/groups/public"
  val releases = "Baleio Releases" at "http://nexus.bale.io/content/repositories/baleio-releases"
  val snapshots = "Baleio Snapshots" at "http://nexus.bale.io/content/repositories/baleio-snapshots"
  val thirdparty = "Baleio 3rd Party" at "http://nexus.bale.io/content/repositories/baleio -thirdparty"
  val allResolvers = Seq(releases, snapshots, thirdparty, mirror)
}

object Dependencies {
  // Versions
  object Versions {
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
    val play = "2.3-M1"
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

  var depOverrides = Set[ModuleID]()
  
  val aopalliance = "aopalliance" % "aopalliance" % "1.0"
  depOverrides = depOverrides ++ Set(aopalliance)

  val oldAntlr = "antlr" % "antlr" % "2.7.7"
  val oldAntlrStringtemplate = "antlr" % "stringtemplate" % "3.2.1"
  depOverrides = depOverrides ++ Set(oldAntlr, oldAntlrStringtemplate)

  val oldAsm = "asm" % "asm" % "3.3.1"
  val oldAsmAttrs = "asm" % "asm-attrs" % "2.2.3"
  val oldAsmCommons = "asm" % "asm-commons" % "3.3.1"
  val oldAsmTree = "asm" % "asm-tree" % "3.3.1"
  val oldAsmUtil = "asm" % "asm-util" % "3.3.1"
  depOverrides = depOverrides ++ Set(oldAsm, oldAsmAttrs, oldAsmCommons, oldAsmTree, oldAsmUtil)

  val batik = "batik" % "batik" % "1.5"
  val batikBridge = "batik" % "batik-brdige" % Versions.batik
  val batikCss = "batik" % "batik-css" % Versions.batik
  val batikDom = "batik" % "batik-dom" % Versions.batik
  val batikExt = "batik" % "batik-ext" % Versions.batik
  val batikParser = "batik" % "batik-parser" % Versions.batik
  val batikRasterizer = "batik" % "batik-rasterizer" % Versions.batik
  val batikScript = "batik" % "batik-script" % Versions.batik
  val batikTranscoder = "batik" % "batik-transcoder" % Versions.batik
  val batikUtil = "batik" % "batik-util" % Versions.batik
  depOverrides = depOverrides ++ Set(batik, batikBridge, batikCss, batikDom, batikExt,
    batikParser, batikRasterizer, batikScript, batikTranscoder, batikUtil)

  val oldBcmailJdk14 = "bouncycastle" % "bcmail-jdk14" % "138"
  val oldBcprovJdk14 = "bouncycastle" % "bcprov-jdk14" % "140"
  val oldbctspJdk14 = "bouncycastle" % "bctsp-jdk14" % "138"
  depOverrides = depOverrides ++ Set(oldBcmailJdk14, oldBcprovJdk14, oldbctspJdk14)

  val oldC3p0 = "c3p0" % "c3p0" % "0.9.1.2"
  depOverrides = depOverrides ++ Set(oldC3p0)

  val oldCglib = "cglib" % "cglib" % Versions.cglib
  val oldCglibNodep = "cglib" % "cglib-nodep" % Versions.cglib
  depOverrides = depOverrides ++ Set(oldCglib, oldCglibNodep)

  val logbackClassic = "ch.qos.logback" % "logback-classic" % Versions.logback
  val logbackCore = "ch.qos.logback" % "logback-core" % Versions.logback
  val logbackJackson = "ch.qos.logback.contrib" % "logback-jackson" % Versions.logback
  val logbackJsonClassic = "ch.qos.logback.contrib" % "logback-json-classic" % Versions.logback
  val logbackJsonCore = "ch.qos.logback.contrib" % "logback-json-core" % Versions.logback
  val logbackMongodbAccess = "ch.qos.logback.contrib" % "logback-mongodb-access" % Versions.logback
  val logbackMongodbClassic = "ch.qos.logback.contrib" % "logback-mongodb-classic" % Versions.logback
  val logbackMongodbCore = "ch.qos.logback.contrib" % "logback-mongodb-core" % Versions.logback
  depOverrides = depOverrides ++ Set(logbackClassic, logbackCore, logbackJackson, logbackJsonClassic, logbackJsonCore,
    logbackMongodbAccess, logbackMongodbClassic, logbackMongodbCore)

  val awsJavaSdk = "com.amazonaws" % "aws-java-sdk" % "1.7.3"
  depOverrides = depOverrides ++ Set(awsJavaSdk)

  val metricsAnnotation = "com.codahale.metrics" % "metrics-annotation" % Versions.metrics
  val metricsCore = "com.codahale.metrics" % "metrics-core" % Versions.metrics
  val metricsEhcache = "com.codahale.metrics" % "metrics-ehcache" % Versions.metrics
  val metricsGanglia = "com.codahale.metrics" % "metrics-ganglia" % Versions.metrics
  val metricsGraphite = "com.codahale.metrics" % "metrics-graphite" % Versions.metrics
  val metricsHealthchecks = "com.codahale.metrics" % "metrics-healthchecks" % Versions.metrics
  val metricsHttpclient = "com.codahale.metrics" % "metrics-httpclient" % Versions.metrics
  val metricsJdbi = "com.codahale.metrics" % "metrics-jdbi" % Versions.metrics
  val metricsJersey = "com.codahale.metrics" % "metrics-jersey" % Versions.metrics
  val metricsJetty8 = "com.codahale.metrics" % "metrics-jetty8" % Versions.metrics
  val metricsJetty9 = "com.codahale.metrics" % "metrics-jetty9" % Versions.metrics
  val metricsJson = "com.codahale.metrics" % "metrics-json" % Versions.metrics
  val metricsJvm = "com.codahale.metrics" % "metrics-jvm" % Versions.metrics
  val metricsLog4j = "com.codahale.metrics" % "metrics-log4j" % Versions.metrics
  val metricsLogback = "com.codahale.metrics" % "metrics-logback" % Versions.metrics
  val metricsServlet = "com.codahale.metrics" % "metrics-servlet" % Versions.metrics
  val metricsServlets = "com.codahale.metrics" % "metrics-servlets" % Versions.metrics
  depOverrides = depOverrides ++ Set(metricsAnnotation, metricsCore, metricsEhcache, metricsGanglia, metricsGraphite,
    metricsHealthchecks, metricsHttpclient, metricsJdbi, metricsJersey, metricsJetty8, metricsJetty9,
    metricsJson, metricsJvm, metricsLog4j, metricsLogback, metricsServlet, metricsServlets)

  val jacksonAnnotations = "com.fasterxml.jackson.core" % "jackson-annotations" % Versions.jackson
  val jacksonCore = "com.fasterxml.jackson.core" % "jackson-core" % Versions.jackson
  val jacksonDatabind = "com.fasterxml.jackson.core" % "jackson-databind" % Versions.jackson
  val jacksonDataformatXml = "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % Versions.jackson
  val jacksonDataformatYaml = "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % Versions.jackson
  val jacksonDatatypeGuava = "com.fasterxml.jackson.datatype" % "jackson-datatype-guava" % Versions.jackson
  val jacksonDatatypeHppc = "com.fasterxml.jackson.datatype" % "jackson-datatype-hppc" % Versions.jackson
  val jacksonDatatypeJoda = "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % Versions.jackson
  val jacksonDatatypeJsonOrg = "com.fasterxml.jackson.datatype" % "jackson-datatype-json-org" % Versions.jackson
  val jacksonDatatypeJsr353 = "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr353" % Versions.jackson
  val jacksonJaxrsBase = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-base" % Versions.jackson
  val jacksonJaxrsJsonProvider = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % Versions.jackson
  val jacksonJaxrsSmileProvider = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-smile-provider" % Versions.jackson
  val jacksonJaxrsXmlProvider = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-xml-provider" % Versions.jackson
  val jacksonModuleJaxbAnnotations = "com.fasterxml.jackson.module" % "jackson-module-jaxb-annotations" % Versions.jackson
  val jacksonModuleAfterburner = "com.fasterxml.jackson.module" % "jackson-module-afterburner" % Versions.jackson
  depOverrides = depOverrides ++ Set(jacksonAnnotations, jacksonCore, jacksonDatabind, jacksonDataformatXml, jacksonDataformatYaml,
    jacksonDatatypeGuava, jacksonDatatypeHppc, jacksonDatatypeJoda, jacksonDatatypeJsonOrg, jacksonDatatypeJsr353, jacksonJaxrsBase,
    jacksonJaxrsJsonProvider, jacksonJaxrsSmileProvider, jacksonJaxrsXmlProvider, jacksonModuleAfterburner, jacksonModuleJaxbAnnotations)

  val slugify = "com.github.slugify" % "slugify" % "2.1.2"
  depOverrides = depOverrides ++ Set(slugify)

  val googleCollections = "com.google.collections" % "google-collections" % "1.0"
  depOverrides = depOverrides ++ Set(googleCollections)

  val guava = "com.google.guava" % "guava" % "16.0.1"
  depOverrides = depOverrides ++ Set(guava)

  val guice = "com.google.inject" % "guice" % Versions.guice
  val guiceAssistedInject = "com.google.inject.extensions" % "guice-assistedinject" % Versions.guice
  val guiceJmx = "com.google.inject.extensions" % "guice-jmx" % Versions.guice
  val guiceJndi = "com.google.inject.extensions" % "guice-jndi" % Versions.guice
  val guiceMultibindings = "com.google.inject.extensions" % "guice-multibindings" % Versions.guice
  val guiceServlet = "com.google.inject.extensions" % "guice-servlet" % Versions.guice
  depOverrides = depOverrides ++ Set(guice, guiceAssistedInject, guiceJmx, guiceJndi, guiceMultibindings, guiceServlet)

  val findbugs = "com.google.code.findbugs" % "findbugs" % "2.0.3"
  val findbugsAnnotations = "com.google.code.findbugs" % "findbugs-annotations" % "2.0.3"
  val findbugsJsr305 = "com.google.code.findbugs" % "jsr305" % "2.0.3"
  depOverrides = depOverrides ++ Set(findbugs, findbugsAnnotations, findbugsJsr305)

  val jsonSimple = "com.googlecode.json-simple" % "json-simple" % "1.1.1"
  depOverrides = depOverrides ++ Set(jsonSimple)

  val pojosr = "com.googlecode.pojosr" % "de.kalpatec.pojosr.framework" % "0.2.1"
  depOverrides = depOverrides ++ Set(pojosr)

  val hazelcast = "com.hazelcast" % "hazelcast" % "3.1.6"
  depOverrides = depOverrides ++ Set(hazelcast)

  val jsch = "com.jcraft" % "jsch" % "0.1.50"
  depOverrides = depOverrides ++ Set(jsch)

  val itext = "com.lowagie" % "itext" % "4.2.1"
  depOverrides = depOverrides ++ Set(itext)

  val c3p0 = "com.mchange" % "c3p0" % "0.9.2.1"
  depOverrides = depOverrides ++ Set(c3p0)

  val base64 = "com.mindprod" % "base64" % "1.6"
  depOverrides = depOverrides ++ Set(base64)

  val mockrunnerJdbc = "com.mockrunner" % "mockrunner-jdbc" % "1.0.0"
  depOverrides = depOverrides ++ Set(mockrunnerJdbc)

  val checkstyle = "com.puppycrawl.tools" % "checkstyle" % "5.7"
  depOverrides = depOverrides ++ Set(checkstyle)

  val rabbitmqAmqpClient = "com.rabbitmq" % "amqp-client" % "3.2.4"
  depOverrides = depOverrides ++ Set(rabbitmqAmqpClient)

  val jersey1Client = "com.sun.jersey" % "jersey-client" % Versions.jersey1
  val jersey1Core = "com.sun.jersey" % "jersey-core" % Versions.jersey1
  val jersey1Server = "com.sun.jersey" % "jersey-server" % Versions.jersey1
  val jersey1Servlet = "com.sun.jersey" % "jersey-servlet" % Versions.jersey1
  depOverrides = depOverrides ++ Set(jersey1Client, jersey1Core, jersey1Server, jersey1Servlet)

  val jersey1Guice = "com.sun.jersey.contribs" % "jersey-guice" % Versions.jersey1
  val jersey1Mulitpart = "com.sun.jersey.contribs" % "jersey-multipart" % Versions.jersey1
  val jersey1Spring = "com.sun.jersey.contribs" % "jersey-spring" % Versions.jersey1
  depOverrides = depOverrides ++ Set(jersey1Guice, jersey1Mulitpart, jersey1Spring)

  val jersey1OauthClient = "com.sun.jersey.contribs.jersey-oauth" % "oauth-client" % Versions.jersey1
  val jersey1OauthSignature = "com.sun.jersey.contribs.jersey-oauth" % "oauth-signature" % Versions.jersey1
  val jersey1OauthServer = "com.sun.jersey.contribs.jersey-oauth" % "oauth-server" % Versions.jersey1
  depOverrides = depOverrides ++ Set(jersey1OauthClient, jersey1OauthSignature, jersey1OauthServer)

  val jaxbImpl = "com.sun.xml.bind" % "jaxb-impl" % "2.2.8-b01"
  val jaxbXjc = "com.sun.xml.bind" % "jaxb-xjc" % "2.2.8-b01"
  depOverrides = depOverrides ++ Set(jaxbImpl, jaxbXjc)

  val paranamer = "com.thoughtworks.paranamer" % "paranamer" % "2.6"
  depOverrides = depOverrides ++ Set(paranamer)

  val xstream = "com.thoughtworks.xstream" % "xstream" % "1.4.7"
  depOverrides = depOverrides ++ Set(xstream)

  val akkaActor = "com.typesafe.akka" % "akka-actor" % Versions.akka
  val akkaRemote = "com.typesafe.akka" % "akka-remote" % Versions.akka
  val akkaSlf4j = "com.typesafe.akka" % "akka-slf4j" % Versions.akka
  depOverrides = depOverrides ++ Set(akkaActor, akkaRemote, akkaSlf4j)

  val proweb = "com.qas" % "proweb" % "4.0"
  depOverrides = depOverrides ++ Set(proweb)

  val swaggerAnnotations = "com.wordnik" %% "swagger-annotations" % Versions.swagger
  val swaggerCore = "com.wordnik" %% "swagger-core" % Versions.swagger
  val swaggerJaxrs = "com.wordnik" %% "swagger-jaxrs" % Versions.swagger
  val swaggerJerseyJaxrs = "com.wordnik" %% "swagger-jersey-jaxrs" % Versions.swagger
  val swaggerJersey2Jaxrs = "com.wordnik" %% "swagger-jersey2-jaxrs" % Versions.swagger
  val swaggerOauth2Server = "com.wordnik" %% "swagger-oauth2-server" % Versions.swagger
  val swaggerScalaServlet = "com.wordnik" %% "swagger-scala-servlet" % Versions.swagger
  val swaggerServlet = "com.wordnik" %% "swagger-servlet" % Versions.swagger
  depOverrides = depOverrides ++ Set(swaggerAnnotations, swaggerCore, swaggerJaxrs, swaggerJersey2Jaxrs,
    swaggerJerseyJaxrs, swaggerOauth2Server, swaggerScalaServlet, swaggerServlet)

  val yammerMetricsAnnotation = "com.yammer.metrics" % "metrics-annotation" % Versions.yammerMetrics
  val yammerMetricsCore = "com.yammer.metrics" % "metrics-core" % Versions.yammerMetrics
  val yammerMetricsEhcache = "com.yammer.metrics" % "metrics-ehcache" % Versions.yammerMetrics
  val yammerMetricsGuice = "com.yammer.metrics" % "metrics-guice" % Versions.yammerMetrics
  val yammerMetricsJersey = "com.yammer.metrics" % "metrics-jersey" % Versions.yammerMetrics
  val yammerMetricsServlet = "com.yammer.metrics" % "metrics-servlet" % Versions.yammerMetrics
  val yammerMetricsSpring = "com.yammer.metrics" % "metrics-spring" % Versions.yammerMetrics
  val yammerMetricsWeb = "com.yammer.metrics" % "metrics-web" % Versions.yammerMetrics
  depOverrides = depOverrides ++ Set(yammerMetricsAnnotation, yammerMetricsCore, yammerMetricsEhcache, yammerMetricsGuice,
    yammerMetricsJersey, yammerMetricsServlet, yammerMetricsSpring, yammerMetricsWeb)

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
  depOverrides = depOverrides ++ Set(commonsBeanutils, commonsCli, commonsCodec, commonsCollections, commonsDaemon, commonsDbcp,
    commonsDigester, commonsFileupload, commonsHttpclient, commonsIo, commonsLang, commonsLogging, commonsLoggingApi,
    commonsPool, commonsNet)

  val dom4j = "dom4j" % "dom4j" % "1.6.1"
  depOverrides = depOverrides ++ Set(dom4j)

  val oldFreemarker = "freemarker" % "freemarker" % "2.3.15"
  depOverrides = depOverrides ++ Set(oldFreemarker)

  val cucumberAndroid = "info.cukes" % "cucumber-android" % Versions.cucumber
  val cucumberClojure = "info.cukes" % "cucumber-clojure" % Versions.cucumber
  val cucumberCore = "info.cukes" % "cucumber-core" % Versions.cucumber
  val cucumberGroovy = "info.cukes" % "cucumber-groovy" % Versions.cucumber
  val cucumberGuice = "info.cukes" % "cucumber-guice" % Versions.cucumber
  val cucumberIoke = "info.cukes" % "cucumber-ioke" % Versions.cucumber
  val cucumberJava = "info.cukes" % "cucumber-java" % Versions.cucumber
  val cucumberJruby = "info.cukes" % "cucumber-jruby" % Versions.cucumber
  val cucumberJunit = "info.cukes" % "cucumber-junit" % Versions.cucumber
  val cucumberJython = "info.cukes" % "cucumber-jython" % Versions.cucumber
  val cucumberNeedle = "info.cukes" % "cucumber-needle" % Versions.cucumber
  val cucumberOpenejb = "info.cukes" % "cucumber-openejb" % Versions.cucumber
  val cucumberPicocontainer = "info.cukes" % "cucumber-picocontainer" % Versions.cucumber
  val cucumberScala = "info.cukes" % "cucumber-scala" % Versions.cucumber
  val cucumberSpring = "info.cukes" % "cucumber-spring" % Versions.cucumber
  val cucumberWeld = "info.cukes" % "cucumber-weld" % Versions.cucumber
  depOverrides = depOverrides ++ Set(cucumberAndroid, cucumberClojure, cucumberCore, cucumberGroovy, cucumberGuice, cucumberIoke,
    cucumberJava, cucumberJruby, cucumberJunit, cucumberJython, cucumberNeedle, cucumberOpenejb, cucumberPicocontainer,
    cucumberScala, cucumberSpring, cucumberWeld)

  val nettyAll = "io.netty" % "netty-all" % Versions.netty
  val nettyBuffer = "io.netty" % "netty-buffer" % Versions.netty
  val nettyCodec = "io.netty" % "netty-codec" % Versions.netty
  val nettyCommon = "io.netty" % "netty-common" % Versions.netty
  val nettyExample = "io.netty" % "netty-example" % Versions.netty
  val nettyHandler = "io.netty" % "netty-handler" % Versions.netty
  val nettyTransport = "io.netty" % "netty-transport" % Versions.netty
  depOverrides = depOverrides ++ Set(nettyAll, nettyBuffer, nettyCodec, nettyCommon, nettyExample, nettyHandler, nettyTransport)

  val javassist = "javassist" % "javassist" % "3.12.1.GA"
  depOverrides = depOverrides ++ Set(javassist)

  val activation = "javax.activation" % "activation" % "1.1.1"
  depOverrides = depOverrides ++ Set(activation)

  val jsr250Api = "javax.annotation" % "jsr250-api" % "1.0"
  depOverrides = depOverrides ++ Set(jsr250Api)

  val javaxAnnotationApi = "javax.annotation" % "javax.annotation-api" % "1.2"
  depOverrides = depOverrides ++ Set(javaxAnnotationApi)

  val javaxCacheApi = "javax.cache" % "cache-api" % "1.0.0-RC1"
  depOverrides = depOverrides ++ Set(javaxCacheApi)

  val elApi = "javax.el" % "el-api" % "2.2"
  depOverrides = depOverrides ++ Set(elApi)

  val javaxElApi = "javax.el" % "javax.el-api" % "3.0.0"
  depOverrides = depOverrides ++ Set(javaxElApi)

  val javaxInject = "javax.inject" % "javax.inject" % "1"
  depOverrides = depOverrides ++ Set(javaxInject)

  val j2ee = "javax.j2ee" % "j2ee" % "1.5"
  depOverrides = depOverrides ++ Set(j2ee)

  val jms = "javax.jms" % "jms" % "1.1"
  depOverrides = depOverrides ++ Set(jms)

  val mail = "javax.mail" % "mail" % "1.4.7"
  depOverrides = depOverrides ++ Set(mail)

  val javaxMailApi = "javax.mail" % "javax.mail-api" % "1.5.1"
  depOverrides = depOverrides ++ Set(javaxMailApi)

  val persistenceApi = "javax.persistence" % "persistence-api" % "1.0.2"
  depOverrides = depOverrides ++ Set(persistenceApi)

  val jsr94 = "javax.rules" % "jsr94" % "1.1"
  depOverrides = depOverrides ++ Set(jsr94)

  val servletApi = "javax.servlet" % "servlet-api" % "2.5"
  depOverrides = depOverrides ++ Set(servletApi)

  val javaxServletApi = "javax.servlet" % "javax.servlet-api" % "3.1.0"
  depOverrides = depOverrides ++ Set(javaxServletApi)

  val jstl = "javax.servlet" % "jstl" % "1.2"
  depOverrides = depOverrides ++ Set(jstl)

  val jspApi = "javax.servlet.jsp" % "jsp-api" % "2.2.1"
  depOverrides = depOverrides ++ Set(jspApi)

  val jstlApi = "javax.servlet.jsp.jstl" % "jstl-api" % "1.2"
  depOverrides = depOverrides ++ Set(jstlApi)

  val jta = "javax.transaction" % "jta" % "1.1"
  depOverrides = depOverrides ++ Set(jta)

  val validationApi = "javax.validation" % "validation-api" % "1.1.0.Final"
  depOverrides = depOverrides ++ Set(validationApi)

  val jsr311Api = "javax.ws.rs" % "jsr311-api" % "1.1.1"
  depOverrides = depOverrides ++ Set(jsr311Api)

  val javaxWsRsApi = "javax.ws.rs" % "javax.ws.rs-api" % "2.0-m10"
  depOverrides = depOverrides ++ Set(javaxWsRsApi)

  val jsr173 = "javax.xml" % "jsr173" % "1.0"
  depOverrides = depOverrides ++ Set(jsr173)

  val jaxbApi = "javax.xml.bind" % "jaxb-api" % "2.2.11"
  depOverrides = depOverrides ++ Set(jaxbApi)

  val staxApi = "javax.xml.stream" % "stax-api" % "1.0-2"
  depOverrides = depOverrides ++ Set(staxApi)

  val jaxen = "jaxen" % "jaxen" % "1.1.4"
  depOverrides = depOverrides ++ Set(jaxen)

  val jdepend = "jdepend" % "jdepend" % "2.9.1"
  depOverrides = depOverrides ++ Set(jdepend)

  val jline = "jline" % "jline" % "2.11"
  depOverrides = depOverrides ++ Set(jline)

  val jodaTime = "joda-time" % "joda-time" % "2.3"
  depOverrides = depOverrides ++ Set(jodaTime)

  val junit = "junit" % "junit" % "4.11"
  depOverrides = depOverrides ++ Set(junit)

  val jxl = "jxl" % "jxl" % "2.6.10"
  depOverrides = depOverrides ++ Set(jxl)

  val log4j = "log4j" % "log4j" % "1.2.17"
  val log4jExtras = "log4j" % "apache-log4j-extras" % "1.2.17"
  depOverrides = depOverrides ++ Set(log4j, log4jExtras)

  val mysqlConnectorJava = "mysql" % "mysql-connector-java" % "5.1.29"
  depOverrides = depOverrides ++ Set(mysqlConnectorJava)

  val jerichoHtml = "net.htmlparser.jericho" % "jericho-html" % "3.3"
  depOverrides = depOverrides ++ Set(jerichoHtml)

  val ehcache = "net.sf.ehcache" % "ehcache" % "2.8.1"
  depOverrides = depOverrides ++ Set(ehcache)

  val flexjson = "net.sf.flexjson" % "flexjson" % "3.2"
  depOverrides = depOverrides ++ Set(flexjson)

  val cobertura = "net.sourceforge.cobertura" % "cobertura" % "2.0.3"
  depOverrides = depOverrides ++ Set(cobertura)

  val saxon = "net.sourceforge.saxon" % "saxon" % "9.1.0.8"
  depOverrides = depOverrides ++ Set(saxon)

  val ognl = "ognl" % "ognl" % "3.0.8"
  depOverrides = depOverrides ++ Set(ognl)

  val opencsv = "opencsv" % "opencsv" % "1.8"
  depOverrides = depOverrides ++ Set(opencsv)

  val antlr = "org.antlr" % "antlr" % "3.5.1"
  val antlrStringtemplate = "org.antlr" % "stringtemplate" % "4.0.2"
  depOverrides = depOverrides ++ Set(antlr, antlrStringtemplate)

  val jakartaOro = "org.apache" % "jakarta-oro" % "2.0.8"
  depOverrides = depOverrides ++ Set(jakartaOro)

  val activemqAll = "org.apache.activemq" % "activemq-all" % Versions.activemq
  val activemqCamel = "org.apache.activemq" % "activemq-camel" % Versions.activemq
  val activemqPool = "org.apache.activemq" % "activemq-pool" % Versions.activemq
  depOverrides = depOverrides ++ Set(activemqAll, activemqCamel, activemqPool)

  val ant = "org.apache.ant" % "ant" % Versions.ant
  val antLauncher = "org.apache.ant" % "ant-launcher" % Versions.ant
  depOverrides = depOverrides ++ Set(ant, antLauncher)

  val avro = "org.apache.avro" % "avro" % Versions.avro
  val avroIpc = "org.apache.avro" % "avro-ipc" % Versions.avro
  depOverrides = depOverrides ++ Set(avro, avroIpc)

  val bsfAll = "org.apache.bsf" % "bsf-all" % "3.0-beta3"
  depOverrides = depOverrides ++ Set(bsfAll)

  val camelAws = "org.apache.camel" % "camel-aws" % Versions.camel
  val camelBeanValidator = "org.apache.camel" % "camel-bean-validator" % Versions.camel
  val camelBindy = "org.apache.camel" % "camel-bindy" % Versions.camel
  val camelCache = "org.apache.camel" % "camel-cache" % Versions.camel
  val camelCore = "org.apache.camel" % "camel-core" % Versions.camel
  val camelCoreXml = "org.apache.camel" % "camel-core-xml" % Versions.camel
  val camelCsv = "org.apache.camel" % "camel-csv" % Versions.camel
  val camelCxf = "org.apache.camel" % "camel-cxf" % Versions.camel
  val camelCxfTransport = "org.apache.camel" % "camel-cxf-transport" % Versions.camel
  val camelDozer = "org.apache.camel" % "camel-dozer" % Versions.camel
  val camelEclipse = "org.apache.camel" % "camel-eclipse" % Versions.camel
  val camelFtp = "org.apache.camel" % "camel-ftp" % Versions.camel
  val camelHttp4 = "org.apache.camel" % "camel-http4" % Versions.camel
  val camelJackson = "org.apache.camel" % "camel-jackson" % Versions.camel
  val camelJaxb = "org.apache.camel" % "camel-jaxb" % Versions.camel
  val camelJdbc = "org.apache.camel" % "camel-jdbc" % Versions.camel
  val camelJms = "org.apache.camel" % "camel-jms" % Versions.camel
  val camelJpa = "org.apache.camel" % "camel-jpa" % Versions.camel
  val camelLucene = "org.apache.camel" % "camel-lucene" % Versions.camel
  val camelMail = "org.apache.camel" % "camel-mail" % Versions.camel
  val camelMongodb = "org.apache.camel" % "camel-mongodb" % Versions.camel
  val camelQuartz = "org.apache.camel" % "camel-quartz" % Versions.camel
  val camelRabbitmq = "org.apache.camel" % "camel-rabbitmq" % Versions.camel
  val camelScala = "org.apache.camel" % "camel-scala" % Versions.camel
  val camelScript = "org.apache.camel" % "camel-script" % Versions.camel
  val camelSmpp = "org.apache.camel" % "camel-smpp" % Versions.camel
  val camelSolr = "org.apache.camel" % "camel-solr" % Versions.camel
  val camelSpring = "org.apache.camel" % "camel-spring" % Versions.camel
  val camelTest = "org.apache.camel" % "camel-test" % Versions.camel
  val camelTestng = "org.apache.camel" % "camel-testng" % Versions.camel
  val camelVelocity = "org.apache.camel" % "camel-velocity" % Versions.camel
  val camelWeb = "org.apache.camel" % "camel-web" % Versions.camel
  val camelWebsocket = "org.apache.camel" % "camel-websocket" % Versions.camel
  val camelXmljson = "org.apache.camel" % "camel-xmljson" % Versions.camel
  val camelXmpp = "org.apache.camel" % "camel-xmpp" % Versions.camel
  val camelXstream = "org.apache.camel" % "camel-xstream" % Versions.camel
  val camelZookeeper = "org.apache.camel" % "camel-zookeeper" % Versions.camel
  depOverrides = depOverrides ++ Set(camelAws, camelBeanValidator, camelBindy, camelCache, camelCore, camelCoreXml, camelCsv,
    camelCxf, camelCxfTransport, camelDozer, camelEclipse, camelFtp, camelHttp4, camelJackson, camelJaxb, camelJdbc,
    camelJms, camelJpa, camelLucene, camelMail, camelMongodb, camelQuartz, camelRabbitmq, camelScala, camelScript,
    camelSmpp, camelSolr, camelSpring, camelTest, camelTestng, camelVelocity, camelWeb, camelWebsocket, camelXmljson,
    camelXmpp, camelXstream, camelZookeeper)

  val commonsLang3 = "org.apache.commons" % "commons-lang3" % "3.3"
  depOverrides = depOverrides ++ Set(commonsLang3)

  val commonsMath3 = "org.apache.commons" % "commons-math3" % "3.2"
  depOverrides = depOverrides ++ Set(commonsMath3)

  val cxfApi = "org.apache.cxf" % "cxf-api" % Versions.cxf
  val cxfBundle = "org.apache.cxf" % "cxf-bundle" % Versions.cxf
  val cxfRtBindingsSoap = "org.apache.cxf" % "cxf-rt-bindings-soap" % Versions.cxf
  val cxfRtBindingsXml = "org.apache.cxf" % "cxf-rt-bindings-xml" % Versions.cxf
  val cxfRtCore = "org.apache.cxf" % "cxf-rt-core" % Versions.cxf
  val cxfRtDatabindingJaxb = "org.apache.cxf" % "cxf-rt-databinding-jaxb" % Versions.cxf
  val cxfRtFeaturesClustering = "org.apache.cxf" % "cxf-rt-features-clustering" % Versions.cxf
  val cxfRtFrontendJaxrs = "org.apache.cxf" % "cxf-rt-frontend-jaxrs" % Versions.cxf
  val cxfRtFrontendJaxws = "org.apache.cxf" % "cxf-rt-frontend-jaxws" % Versions.cxf
  val cxfRtFrontendSimple = "org.apache.cxf" % "cxf-rt-frontend-simple" % Versions.cxf
  val cxfRtRsExtensionProviders = "org.apache.cxf" % "cxf-rt-rs-extension-providers" % Versions.cxf
  val cxfRtRsExtensionSearch = "org.apache.cxf" % "cxf-rt-rs-extension-search" % Versions.cxf
  val cxfRtRsSecurityCors = "org.apache.cxf" % "cxf-rt-rs-security-cors" % Versions.cxf
  val cxfRtRsSecurityOauth = "org.apache.cxf" % "cxf-rt-rs-security-oauth" % Versions.cxf
  val cxfRtRsSecurityOauth2 = "org.apache.cxf" % "cxf-rt-rs-security-oauth2" % Versions.cxf
  val cxfRtTransportsHttp = "org.apache.cxf" % "cxf-rt-transports-http" % Versions.cxf
  val cxfRtTransportsHttpJetty = "org.apache.cxf" % "cxf-rt-transports-http-jetty" % Versions.cxf
  val cxfRtWsAddr = "org.apache.cxf" % "cxf-rt-ws-addr" % Versions.cxf
  val cxfTestutils = "org.apache.cxf" % "cxf-testutils" % Versions.cxf
  val cxfSystestsJaxrs = "org.apache.cxf.systests" % "cxf-systests-jaxrs" % Versions.cxf
  depOverrides = depOverrides ++ Set(cxfApi, cxfBundle, cxfRtBindingsSoap, cxfRtBindingsXml, cxfRtCore, cxfRtDatabindingJaxb,
    cxfRtFeaturesClustering, cxfRtFrontendJaxrs, cxfRtFrontendJaxws, cxfRtFrontendSimple, cxfRtRsExtensionProviders,
    cxfRtRsExtensionSearch, cxfRtRsSecurityCors, cxfRtRsSecurityOauth, cxfRtRsSecurityOauth2, cxfRtTransportsHttp,
    cxfRtTransportsHttpJetty, cxfRtWsAddr, cxfTestutils, cxfSystestsJaxrs)

  val geronimoAnnotation10Spec = "org.apache.geronimo.specs" % "geronimo-annotation_1.0_spec" % "1.1.1"
  depOverrides = depOverrides ++ Set(geronimoAnnotation10Spec)

  val geronimoJ2ee11Spec = "org.apache.geronimo.specs" % "geronimo-j2ee-management_1.1_spec" % "1.0.1"
  depOverrides = depOverrides ++ Set(geronimoJ2ee11Spec)

  val geronimoJaspic10Spec = "org.apache.geronimo.specs" % "geronimo-jaspic_1.0_spec" % "1.1"
  depOverrides = depOverrides ++ Set(geronimoJaspic10Spec)

  val geronimoJms11Spec = "org.apache.geronimo.specs" % "geronimo-jms_1.1_spec" % "1.1.1"
  depOverrides = depOverrides ++ Set(geronimoJms11Spec)

  val geronimoJta101BSpec = "org.apache.geronimo.specs" % "geronimo-jta_1.0.1B_spec" % "1.1.1"
  depOverrides = depOverrides ++ Set(geronimoJta101BSpec)

  val geronimoJta11Spec = "org.apache.geronimo.specs" % "geronimo-jta_1.1_spec" % "1.1.1"
  depOverrides = depOverrides ++ Set(geronimoJta11Spec)

  val geronimoServlet25Spec = "org.apache.geronimo.specs" % "geronimo-servlet_2.5_spec" % "1.2"
  depOverrides = depOverrides ++ Set(geronimoServlet25Spec)

  val geronimoServlet30Spec = "org.apache.geronimo.specs" % "geronimo-servlet_3.0_spec" % "1.0"
  depOverrides = depOverrides ++ Set(geronimoServlet30Spec)

  val geronimoStaxApi10Spec = "org.apache.geronimo.specs" % "geronimo-stax-api_1.0_spec" % "1.0.1"
  depOverrides = depOverrides ++ Set(geronimoStaxApi10Spec)

  val httpclient = "org.apache.httpcomponents" % "httpclient" % Versions.httpComponents
  val httpclientCache = "org.apache.httpcomponents" % "httpclient-cache" % Versions.httpComponents
  val httpcore = "org.apache.httpcomponents" % "httpcore" % "4.3.2"
  val httpmime = "org.apache.httpcomponents" % "httpmime" % Versions.httpComponents
  depOverrides = depOverrides ++ Set(httpclient, httpclientCache, httpcore, httpmime)

  val log4j2 = "org.apache.logging.log4j" % "log4j" % "2.0-rc1"
  depOverrides = depOverrides ++ Set(log4j2)

  val lucenceAnalyzersCommon = "org.apache.lucene" % "lucene-analyzers-common" % Versions.lucene
  val lucenceCore = "org.apache.lucene" % "lucene-core" % Versions.lucene
  depOverrides = depOverrides ++ Set(lucenceAnalyzersCommon, lucenceCore)

  val tomcat = "org.apache.tomcat" % "tomcat" % Versions.tomcat
  depOverrides = depOverrides ++ Set(tomcat)

  val xbeanSpring = "org.apache.xbean" % "xbean-spring" % "3.16"
  depOverrides = depOverrides ++ Set(xbeanSpring)

  val xmlbeans = "org.apache.xmlbeans" % "xmlbeans" % "2.5.0"
  depOverrides = depOverrides ++ Set(xmlbeans)

  val aspectjrt = "org.aspectj" % "aspectjrt" % Versions.aspectj
  val aspectjtools = "org.aspectj" % "aspectjtools" % Versions.aspectj
  val aspectjweaver = "org.aspectj" % "aspectjweaver" % Versions.aspectj
  depOverrides = depOverrides ++ Set(aspectjrt, aspectjtools, aspectjweaver)

  val bcmailJdk14 = "org.bouncycastle" % "bcmail-jdk14" % Versions.bouncycastle
  val bcmailJdk15on = "org.bouncycastle" % "bcmail-jdk15on" % Versions.bouncycastle
  val bcpgJdk14 = "org.bouncycastle" % "bcpg-jdk14" % Versions.bouncycastle
  val bcpgJdk15on = "org.bouncycastle" % "bcpg-jdk15on" % Versions.bouncycastle
  val bcpkixJdk14 = "org.bouncycastle" % "bcpkix-jdk14" % Versions.bouncycastle
  val bcpkixJdk145on = "org.bouncycastle" % "bcpkix-jdk145on" % Versions.bouncycastle
  val bcprovJdk14 = "org.bouncycastle" % "bcprov-jdk14" % Versions.bouncycastle
  val bcprovJdk15on = "org.bouncycastle" % "bcprov-jdk15on" % Versions.bouncycastle
  val bcprovExtJdk14 = "org.bouncycastle" % "bcprov-ext-jdk14" % Versions.bouncycastle
  val bcprovExtJdk15on = "org.bouncycastle" % "bcprov-ext-jdk15on" % Versions.bouncycastle
  depOverrides = depOverrides ++ Set(bcmailJdk14, bcmailJdk15on, bcpgJdk14, bcpgJdk15on, bcpkixJdk14, bcpkixJdk145on,
    bcprovJdk14, bcprovJdk15on, bcprovExtJdk14, bcprovExtJdk15on)

  val enunciateCoreAnnotations = "org.codehaus.enunciate" % "enunciate-core-annotations" % "1.28"
  depOverrides = depOverrides ++ Set(enunciateCoreAnnotations)

  val groovy = "org.codehaus.groovy" % "groovy" % "2.2.2"
  val groovyAll = "org.codehaus.groovy" % "groovy-all" % "2.2.2"
  depOverrides = depOverrides ++ Set(groovy, groovyAll)

  val jackson1CoreAsl = "org.codehaus.jackson" % "jackson-core-asl" % Versions.jackson1
  val jackson1Jaxrs = "org.codehaus.jackson" % "jackson-jaxrs" % Versions.jackson1
  val jackson1MapperAsl = "org.codehaus.jackson" % "jackson-mapper-asl" % Versions.jackson1
  val jackson1Xc = "org.codehaus.jackson" % "jackson-xc" % Versions.jackson1
  depOverrides = depOverrides ++ Set(jackson1CoreAsl, jackson1Jaxrs, jackson1MapperAsl, jackson1Xc)

  val jettison = "org.codehaus.jettison" % "jettison" % "1.3.5"
  depOverrides = depOverrides ++ Set(jettison)

  val easymock = "org.easymock" % "easymock" % "3.2"
  depOverrides = depOverrides ++ Set(easymock)

  val jettyAnt = "org.eclipse.jetty" % "jetty-ant" % Versions.jetty
  val jettyDistribution = "org.eclipse.jetty" % "jetty-distribution" % Versions.jetty
  val jettyServer = "org.eclipse.jetty" % "jetty-server" % Versions.jetty
  depOverrides = depOverrides ++ Set(jettyAnt, jettyDistribution, jettyServer)

  val eclipseLink = "org.eclipse.persistence" % "eclipselink" % "2.5.1"
  depOverrides = depOverrides ++ Set(eclipseLink)

  val javaxPersistence = "org.eclipse.persistence" % "javax.persistence" % "2.1.0"
  depOverrides = depOverrides ++ Set(javaxPersistence)

  val freemarker = "org.freemarker" % "freemarker" % Versions.freemarker
  val freemarkerGae = "org.freemarker" % "freemarker-gae" % Versions.freemarker
  depOverrides = depOverrides ++ Set(freemarker, freemarkerGae)

  val jerseyJettyConnector = "org.glassfish.jersey.connector" % "jersey-jetty-connector" % Versions.jersey
  depOverrides = depOverrides ++ Set(jerseyJettyConnector)

  val jerseyClient = "org.glassfish.jersey.core" % "jersey-client" % Versions.jersey
  val jerseyCommon = "org.glassfish.jersey.core" % "jersey-common" % Versions.jersey
  val jerseyServer = "org.glassfish.jersey.core" % "jersey-server" % Versions.jersey
  depOverrides = depOverrides ++ Set(jerseyClient, jerseyCommon, jerseyServer)

  val jerseyBeanValidation = "org.glassfish.jersey.ext" % "jersey-bean-validation" % Versions.jersey
  val jerseyDeclarativeLinking = "org.glassfish.jersey.media" % "jersey-declarative-linking" % Versions.jersey
  val jerseySpring3 = "org.glassfish.jersey.media" % "jersey-spring3" % Versions.jersey
  depOverrides = depOverrides ++ Set(jerseyBeanValidation, jerseyDeclarativeLinking, jerseySpring3)

  val jerseyMediaJson = "org.glassfish.jersey.media" % "jersey-media-json" % Versions.jersey
  val jerseyMediaJsonJackson = "org.glassfish.jersey.media" % "jersey-media-json-jackson" % Versions.jersey
  val jerseyMediaJsonJettison = "org.glassfish.jersey.media" % "jersey-media-json-jettison" % Versions.jersey
  val jerseyMediaMultipart = "org.glassfish.jersey.media" % "jersey-media-multipart" % Versions.jersey
  depOverrides = depOverrides ++ Set(jerseyMediaJson, jerseyMediaJsonJackson, jerseyMediaJsonJettison, jerseyMediaMultipart)

  val jerseyOauth2Client = "org.glassfish.jersey.security" % "oauth2-client" % Versions.jersey
  depOverrides = depOverrides ++ Set(jerseyOauth2Client)

  val hibernateC3p0 = "org.hibernate" % "hibernate-c3p0" % Versions.hibernate
  val hibernateCore = "org.hibernate" % "hibernate-core" % Versions.hibernate
  val hibernateEhcache = "org.hibernate" % "hibernate-ehcache" % Versions.hibernate
  val hibernateEntitymanager = "org.hibernate" % "hibernate-entitymanager" % Versions.hibernate
  val hibernateSearch = "org.hibernate" % "hibernate-search" % "4.5.0.Final"
  val hibernateValidator = "org.hibernate" % "hibernate-validator" % "5.1.0.Final"
  depOverrides = depOverrides ++ Set(hibernateC3p0, hibernateCore, hibernateEhcache, hibernateEntitymanager, hibernateSearch,
    hibernateValidator)

  val hsqldb = "org.hsqldb" % "hsqldb" % "2.3.2"
  depOverrides = depOverrides ++ Set(hsqldb)

  val jdom = "org.jdom" % "jdom" % "2.0.2"
  depOverrides = depOverrides ++ Set(jdom)

  val jencks = "org.jencks" % "jencks" % Versions.jencks
  val jencksAmqpool = "org.jencks" % "jencks-amqpool" % Versions.jencks
  depOverrides = depOverrides ++ Set(jencks, jencksAmqpool)

  val json4sJackson = "org.json4s" %% "json4s-jackson" % Versions.json4s
  val json4sNative = "org.json4s" %% "json4s-native" % Versions.json4s
  depOverrides = depOverrides ++ Set(json4sJackson, json4sNative)

  val annox = "org.jvnet.annox" % "annox" % "0.5.1"
  depOverrides = depOverrides ++ Set(annox)

  val jetty6 = "org.mortbay.jetty" % "jetty" % Versions.jetty6
  val jettyManagement6 = "org.mortbay.jetty" % "jetty-management" % Versions.jetty6
  val jettyUtil6 = "org.mortbay.jetty" % "jetty-util" % Versions.jetty6
  depOverrides = depOverrides ++ Set(jetty6, jettyManagement6, jettyUtil6)

  val mybatis = "org.mybatis" % "mybatis" %"3.2.5"
  val mybatisEhcache = "org.mybatis" % "mybatis-ehcache" %"1.0.0"
  val mybatisGuice = "org.mybatis" % "mybatis-guice" %"3.5"
  val mybatisSpring = "org.mybatis" % "mybatis-spring" %"1.2.2"
  depOverrides = depOverrides ++ Set(mybatis, mybatisEhcache, mybatisGuice, mybatisSpring)

  val mockitoAll = "org.mockito" % "mockito-all" % "1.9.5"
  depOverrides = depOverrides ++ Set(mockitoAll)

  val mongoJavaDriver = "org.mongodb" % "mongo-java-driver" % "2.11.4"
  depOverrides = depOverrides ++ Set(mongoJavaDriver)

  val mvel2 = "org.mvel" % "mvel2" % "2.1.9.Final"
  depOverrides = depOverrides ++ Set(mvel2)

  val objenesis = "org.objenesis" % "objenesis" % "2.1"
  depOverrides = depOverrides ++ Set(objenesis)

  val ostermillerUtils = "org.ostermiller" % "utils" % "1.07.00"
  depOverrides = depOverrides ++ Set(ostermillerUtils)

  val asm = "org.ow2.asm" % "asm" % Versions.asm
  val asmAll = "org.ow2.asm" % "asm-all" % Versions.asm
  val asmAnalysis = "org.ow2.asm" % "asm-analysis" % Versions.asm
  val asmCommons = "org.ow2.asm" % "asm-commons" % Versions.asm
  val asmDebugAll = "org.ow2.asm" % "asm-debug-all" % Versions.asm
  val asmTree = "org.ow2.asm" % "asm-tree" % Versions.asm
  val asmUtil = "org.ow2.asm" % "asm-util" % Versions.asm
  val asmXml = "org.ow2.asm" % "asm-xml" % Versions.asm
  depOverrides = depOverrides ++ Set(asm, asmAll, asmAnalysis, asmCommons, asmDebugAll, asmTree, asmUtil, asmXml)

  val powermockApi = "org.powermock" % "powermock-api" % Versions.powermock
  val powermockCore = "org.powermock" % "powermock-core" % Versions.powermock
  val powermockEasymockReleaseFull = "org.powermock" % "powermock-easymock-release-full" % Versions.powermock
  val powermockMockitoReleaseFull = "org.powermock" % "powermock-mockito-release-full" % Versions.powermock
  val powermockModuleJunit4 = "org.powermock" % "powermock-module-junit4" % Versions.powermock
  val powermockModuleJunit4Common = "org.powermock" % "powermock-module-junit4-common" % Versions.powermock
  val powermockModuleTestng = "org.powermock" % "powermock-module-testng" % Versions.powermock
  val powermockModuleTestngCommon = "org.powermock" % "powermock-module-testng-common" % Versions.powermock
  depOverrides = depOverrides ++ Set(powermockApi, powermockCore, powermockEasymockReleaseFull, powermockMockitoReleaseFull,
    powermockModuleJunit4, powermockModuleJunit4Common, powermockModuleTestng, powermockModuleTestngCommon)

  val quartz = "org.quartz-scheduler" % "quartz" % "2.2.1"
  depOverrides = depOverrides ++ Set(quartz)

  val scalaActors = "org.scala-lang" % "scala-actors" % Versions.scala
  val scalaCompiler = "org.scala-lang" % "scala-compiler" % Versions.scala
  val scalaDist = "org.scala-lang" % "scala-dist" % Versions.scala
  val scalaLibrary = "org.scala-lang" % "scala-library" % Versions.scala
  val scalaLibraryAll = "org.scala-lang" % "scala-library-all" % Versions.scala
  val scalaReflect = "org.scala-lang" % "scala-reflect" % Versions.scala
  val scalap = "org.scala-lang" % "scalap" % Versions.scala
  depOverrides = depOverrides ++ Set(scalaActors, scalaCompiler, scalaDist, scalaLibrary, scalaLibraryAll, scalaReflect, scalap)

  val scalaAsync = "org.scala-lang.modules" %% "scala-async" % "0.9.1"
  val scalaPartest = "org.scala-lang.modules" %% "scala-partest" % "1.0.10"
  val scalaPartestInterface = "org.scala-lang.modules" %% "scala-partest-interface" % "0.4.0"
  val scalaSwing = "org.scala-lang.modules" %% "scala-swing" % "1.0.1"
  val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.0.1"
  depOverrides = depOverrides ++ Set(scalaAsync, scalaPartest, scalaPartestInterface, scalaSwing, scalaXml)
  
  val scalastyle = "org.scalastyle" %% "scalastyle" % Versions.scalastyle
  depOverrides = depOverrides ++ Set(scalastyle)

  val jclOverSlf4j = "org.slf4j" % "jcl-over-slf4j" % Versions.slf4j
  depOverrides = depOverrides ++ Set(jclOverSlf4j)

  val slf4jAndroid = "org.slf4j" % "slf4j-android" % Versions.slf4j
  val slf4jApi = "org.slf4j" % "slf4j-api" % Versions.slf4j
  val slf4jExt = "org.slf4j" % "slf4j-ext" % Versions.slf4j
  val slf4jJcl = "org.slf4j" % "slf4j-jcl" % Versions.slf4j
  val slf4jLog4j12 = "org.slf4j" % "slf4j-log4j12" % Versions.slf4j
  val slf4jSimple = "org.slf4j" % "slf4j-simple" % Versions.slf4j
  depOverrides = depOverrides ++ Set(slf4jAndroid, slf4jApi, slf4jExt, slf4jJcl, slf4jLog4j12, slf4jSimple)

  val springAop = "org.springframework" % "spring-aop" % Versions.spring
  val springAsm = "org.springframework" % "spring-asm" % Versions.spring
  val springAspects = "org.springframework" % "spring-aspects" % Versions.spring
  val springBeans = "org.springframework" % "spring-beans" % Versions.spring
  val springContext = "org.springframework" % "spring-context" % Versions.spring
  val springContextSupport = "org.springframework" % "spring-context-support" % Versions.spring
  val springCore = "org.springframework" % "spring-core" % Versions.spring
  val springExpression = "org.springframework" % "spring-expression" % Versions.spring
  val springInstrument = "org.springframework" % "spring-instrument" % Versions.spring
  val springJdbc = "org.springframework" % "spring-jdbc" % Versions.spring
  val springJms = "org.springframework" % "spring-jms" % Versions.spring
  val springOrm = "org.springframework" % "spring-orm" % Versions.spring
  val springOxm = "org.springframework" % "spring-oxm" % Versions.spring
  val springTest = "org.springframework" % "spring-test" % Versions.spring
  val springTx = "org.springframework" % "spring-tx" % Versions.spring
  val springWeb = "org.springframework" % "spring-web" % Versions.spring
  val springWebmvc = "org.springframework" % "spring-webmvc" % Versions.spring
  depOverrides = depOverrides ++ Set(springAop, springAsm, springAspects, springBeans, springContext, springContextSupport,
    springCore, springExpression, springInstrument, springJdbc, springJms, springOrm, springOxm, springTest, springTx,
    springWeb, springWebmvc)

  val springIntegrationCore = "org.springframework.integration" % "spring-integration-core" % Versions.springIntegration
  val springIntegrationEvent = "org.springframework.integration" % "spring-integration-event" % Versions.springIntegration
  val springIntegrationFile = "org.springframework.integration" % "spring-integration-file" % Versions.springIntegration
  val springIntegrationHttp = "org.springframework.integration" % "spring-integration-http" % Versions.springIntegration
  val springIntegrationJms = "org.springframework.integration" % "spring-integration-jms" % Versions.springIntegration
  val springIntegrationMail = "org.springframework.integration" % "spring-integration-mail" % Versions.springIntegration
  val springIntegrationRmi = "org.springframework.integration" % "spring-integration-rmi" % Versions.springIntegration
  val springIntegrationSecurity = "org.springframework.integration" % "spring-integration-security" % Versions.springIntegration
  val springIntegrationStream = "org.springframework.integration" % "spring-integration-stream" % Versions.springIntegration
  val springIntegrationWs = "org.springframework.integration" % "spring-integration-ws" % Versions.springIntegration
  val springIntegrationXml = "org.springframework.integration" % "spring-integration-xml" % Versions.springIntegration
  depOverrides = depOverrides ++ Set(springIntegrationCore, springIntegrationEvent, springIntegrationFile, springIntegrationHttp,
    springIntegrationJms, springIntegrationMail, springIntegrationRmi, springIntegrationSecurity, springIntegrationStream,
    springIntegrationWs, springIntegrationXml)

  val springSecurityAcl = "org.springframework.security" % "spring-security-acl" % Versions.springSecurity
  val springSecurityCas = "org.springframework.security" % "spring-security-cas" % Versions.springSecurity
  val springSecurityConfig = "org.springframework.security" % "spring-security-config" % Versions.springSecurity
  val springSecurityCore = "org.springframework.security" % "spring-security-core" % Versions.springSecurity
  val springSecurityCrypto = "org.springframework.security" % "spring-security-crypto" % Versions.springSecurity
  val springSecurityLdap = "org.springframework.security" % "spring-security-ldap" % Versions.springSecurity
  val springSecurityOpenId = "org.springframework.security" % "spring-security-openid" % Versions.springSecurity
  val springSecurityWeb = "org.springframework.security" % "spring-security-web" % Versions.springSecurity
  depOverrides = depOverrides ++ Set(springSecurityAcl, springSecurityCas, springSecurityConfig, springSecurityCore,
    springSecurityCrypto, springSecurityLdap, springSecurityOpenId, springSecurityWeb)

  val springSecurityOauth2 = "org.springframework.security.oauth" % "spring-security-oauth2" % Versions.springSecurityOauth
  depOverrides = depOverrides ++ Set(springSecurityOauth2)

  val testng = "org.testng" % "testng" % "6.8.8"
  depOverrides = depOverrides ++ Set(testng)

  val snakeYaml = "org.yaml" % "snakeyaml" % "1.13"
  depOverrides = depOverrides ++ Set(snakeYaml)

  val oldStaxApi = "stax" % "stax-api" % "1.0.1"
  depOverrides = depOverrides ++ Set(oldStaxApi)

  val taglibsStandard = "taglibs" % "standard" % "1.1.2"
  depOverrides = depOverrides ++ Set(taglibsStandard)

  val xalan = "xalan" % "xalan" % "2.7.1"
  depOverrides = depOverrides ++ Set(xalan)

  val xerces = "xerces" % "xerces" % "2.4.0"
  val xercesImpl = "xerces" % "xercesImpl" % "2.11.0"
  depOverrides = depOverrides ++ Set(xerces, xercesImpl)

  val xmlApis = "xml-apis" % "xml-apis" % "1.4.01"
  depOverrides = depOverrides ++ Set(xmlApis)

  val xmlunit = "xmlunit" % "xmlunit" % "1.5"
  depOverrides = depOverrides ++ Set(xmlunit)

  val xom = "xom" % "xom" % "1.2.5"
  depOverrides = depOverrides ++ Set(xom)

  val xpp3min = "xpp3_min" % "xpp3_min" % "1.1.4c"
  depOverrides = depOverrides ++ Set(xpp3min)

  val soaRsDependencies = Seq(scalaLibrary, logbackClassic % "runtime", slf4jApi, metricsAnnotation, metricsCore % "runtime",
    metricsHealthchecks % "runtime", metricsJvm % "runtime", metricsLogback % "runtime", metricsServlet % "runtime",
    metricsServlets % "runtime")

  val soaModelDependencies = Seq(scalaLibrary, javaxPersistence, validationApi, hibernateValidator)

  val playDependencies = Seq()
}

object Plugins {
  import Dependencies._

  // IDEs
  val sbtEclipse = "com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0"
  val sbtIdea = "com.github.mpeltonen" % "sbt-idea" % "1.6.0"
  val sbtNetbeans = "org.netbeans" %% "sbt-netbeans-plugin" % "0.1.4"
  val sbtSublime = "com.orrsella" % "sbt-sublime" % "1.0.9"

  // Web
  val sbtWeb = "com.earldouglas" % "xsbt-web-plugin" % "0.9.0"
  val sbtCloudbees = "eu.getintheloop" %% "sbt-cloudbees-plugin" % "0.4.0"

  // Test
  val sbtCucumber = "templemore" % "sbt-cucumber-plugin" % "0.8.0"
  val sbtMultiJvm = "com.typesafe.sbt" % "sbt-multi-jvm" % "0.3.8"
  val sbtTestng = "de.johoop" % "sbt-testng-plugin" % "3.0.0"

  // Static Code Analysis
  val cpd4sbt = "de.johoop" % "cpd4sbt" % "1.1.4"
  val findbugs4sbt = "de.johoop" % "findbugs4sbt" % "1.3.0"
  val scalastyleSbt = "org.scalastyle" %% "scalastyle-sbt-plugin" % "0.4.0"
  val sbtStats = "com.orrsella" % "sbt-stats" % "1.0.5"

  // One Jar
  val sbtAssembly = "com.eed3si9n" % "sbt-assembly" % "0.11.2"
  val sbtAppbundle = "de.sciss" % "sbt-appbundle" % "1.0.1"
  val sbtOnejar = "org.scala-sbt.plugins" % "sbt-onejar" % "0.8"

  // Frontend Development
  val coffescriptSbt = "me.lessis" % "coffeescripted-sbt" % "0.2.3"
  val lessSbt = "me.lessis" % "less-sbt" % "0.2.2"
  val sbtStyles = "com.github.btd" %% "sbt-styles-plugin" % "0.0.3"
  val sbtEmberjs = "com.github.stefri" % "sbt-emberjs" % "0.4"
  val sbtYuiCompressor = "in.drajit.sbt" % "sbt-yui-compressor" % "0.2.0"
  val sbtRequirejs = "org.scalatra.requirejs" % "sbt-requirejs" % "0.0.3"
  val sbtVaadin = "org.vaadin.sbt" % "sbt-vaadin-plugin" % "1.0.0"

  // Release
  val sbtNative = "com.typesafe.sbt" % "sbt-native-packager" % "0.7.0-RC2"
  val sbtStartScript = "com.typesafe.sbt" % "sbt-start-script" % "0.10.0"
  val sbtPack = "org.xerial.sbt" % "sbt-pack" % "0.5.1"
  val sbtRelease = "com.github.gseitz" % "sbt-release" % "0.8.3"
  val aetherDeploy = "no.arktekk.sbt" % "aether-deploy" % "0.11"

  // System
  val sbtGit = "com.typesafe.sbt" % "sbt-git" % "0.6.2"

  // Code Generator
  val sbtXjc = "org.scala-sbt.plugins" % "sbt-xjc" % "0.5"
  val sbtThrift = "com.github.bigtoast" % "sbt-thrift" % "0.6"
  val sbtAntlr = "com.github.stefri" % "sbt-antlr" % "0.5"
  val sbtAntlr4 = "com.simplytyped" % "sbt-antlr4" % "0.7.1"
  val sbtAvro = "com.cavorite" % "sbt-avro" % "0.3.2"
  val sbtProtobuf = "com.github.gseitz" % "sbt-protobuf" % "0.3.2"
  val sbtScalabuff = "com.github.sbt" %% "sbt-scalabuff" % "0.2"
  val sbtFmpp = "com.github.sbt" %% "sbt-fmpp" % "0.3"

  // Database
  val sbtDbdeploy = "mrken" %% "sbt-dbdeploy" % "0.1"
  val sbtLiquibase = "com.github.bigtoast" % "sbt-liquibase" % "0.5"
  val sbtFlyaway = "org.flywaydb" % "flyway-sbt" % "3.0"

  // Documentation
  val sbtSite = "com.typesafe.sbt" % "sbt-site" % "0.7.2"

  // Library Dependency
  val sbtDependencyGraph = "net.virtual-void" % "sbt-dependency-graph" % "0.7.4"
  val sbtLock = "com.github.tkawachi" % "sbt-lock" % "0.1.1"
  val sbtUpdates = "com.timushev.sbt" % "sbt-updates" % "0.1.5"
  val sbtDirtyMoney = "com.eed3si9n" % "sbt-dirty-money" % "0.1.0"
  val lsSbt = "me.lessis" % "ls-sbt" % "0.1.3"

  // Utility
  val sbtAboutPlugins = "com.github.jozic" % "sbt-about-plugins" % "0.1.0"
  val sbtBuildinfo = "com.eed3si9n" % "sbt-buildinfo" % "0.3.1"

  // Code Coverage
  val scct = "ch.craven" %% "scct-plugin" % "0.2"
  val sbtScoverage = "org.scoverage" %% "sbt-scoverage" % "0.98.2"
  val jacoco4sbt = "de.johoop" % "jacoco4sbt" % "2.1.4"

  // Android
  val sbtAndroid = "org.scala-sbt" % "sbt-android-plugin" % "0.6.2"
  val androidSdk = "com.hanhuy.sbt" % "android-sdk-plugin" % "1.2.14"

  // Build Interoperability
  val ant4Sbt = "de.johoop" % "ant4sbt" % "1.1.2"

  // OSGI
  val sbtOsgi = "com.typesafe.sbt" % "sbt-osgi" % "0.7.0"

  // Play
  val play = "com.typesafe.play" % "sbt-plugin" % Versions.play
}

object Settings {

  import Dependencies._
  import Resolvers._

  val commonSettings = Seq(
    organizationName := "Baleio Inc.",
    organizationHomepage := Some(url("http://www.bale.io")),
    scalaVersion := Versions.scala,
    resolvers := allResolvers,
    conflictManager := ConflictManager.strict,
    exportJars := true,
    autoScalaLibrary := false,
    crossPaths := false,
    dependencyOverrides ++= depOverrides,
    scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked", "-feature"),
    scalacOptions in(Compile, doc) ++= Seq("-external-urls:scala=http://www.scala-lang.org/api/current/", "-no-link-warnings"),
    javacOptions ++= Seq("-encoding", "UTF-8", "-source", Versions.java, "-target", Versions.java, "-Xlint:all"),
    javacOptions in(Compile, doc) ++= Seq("-external-urls:java=http://www.scala-lang.org/api/current/", "-no-link-warnings"),
    publishMavenStyle := true,
    publishTo <<= version {
      (v: String) =>
        if (v.trim.endsWith("SNAPSHOT"))
          Some(snapshots)
        else
          Some(releases)
    },
    credentials += Credentials(Path.userHome / ".sbt" / ".auth-baleio"))

  def SOAProject(name : String) = (
      Project(name, file(name))
      settings(commonSettings:_*)
  )

}

