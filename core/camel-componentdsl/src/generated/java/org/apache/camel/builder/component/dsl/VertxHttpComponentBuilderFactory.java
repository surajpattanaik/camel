/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.vertx.http.VertxHttpComponent;

/**
 * Send requests to external HTTP servers using Vert.x
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface VertxHttpComponentBuilderFactory {

    /**
     * Vert.x HTTP Client (camel-vertx-http)
     * Send requests to external HTTP servers using Vert.x
     * 
     * Category: http
     * Since: 3.5
     * Maven coordinates: org.apache.camel:camel-vertx-http
     */
    static VertxHttpComponentBuilder vertxHttp() {
        return new VertxHttpComponentBuilderImpl();
    }

    /**
     * Builder for the Vert.x HTTP Client component.
     */
    interface VertxHttpComponentBuilder
            extends
                ComponentBuilder<VertxHttpComponent> {
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxHttpComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether to allow java serialization when a request has the
         * Content-Type application/x-java-serialized-object This is disabled by
         * default. If you enable this, be aware that Java will deserialize the
         * incoming data from the request. This can be a potential security
         * risk.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default VertxHttpComponentBuilder allowJavaSerializedObject(
                boolean allowJavaSerializedObject) {
            doSetProperty("allowJavaSerializedObject", allowJavaSerializedObject);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        @Deprecated
        default VertxHttpComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use an existing vertx instead of creating a new instance.
         * 
         * The option is a: <code>io.vertx.core.Vertx</code> type.
         * 
         * Group: advanced
         */
        default VertxHttpComponentBuilder vertx(io.vertx.core.Vertx vertx) {
            doSetProperty("vertx", vertx);
            return this;
        }
        /**
         * A custom VertxHttpBinding which can control how to bind between
         * Vert.x and Camel.
         * 
         * The option is a:
         * <code>org.apache.camel.component.vertx.http.VertxHttpBinding</code>
         * type.
         * 
         * Group: advanced
         */
        default VertxHttpComponentBuilder vertxHttpBinding(
                org.apache.camel.component.vertx.http.VertxHttpBinding vertxHttpBinding) {
            doSetProperty("vertxHttpBinding", vertxHttpBinding);
            return this;
        }
        /**
         * To provide a custom set of vertx options for configuring vertx.
         * 
         * The option is a: <code>io.vertx.core.VertxOptions</code> type.
         * 
         * Group: advanced
         */
        default VertxHttpComponentBuilder vertxOptions(
                io.vertx.core.VertxOptions vertxOptions) {
            doSetProperty("vertxOptions", vertxOptions);
            return this;
        }
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: filter
         */
        default VertxHttpComponentBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * The proxy server host address.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy server password if authentication is required.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpComponentBuilder proxyPassword(
                java.lang.String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * The proxy server port.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy server type.
         * 
         * The option is a: <code>io.vertx.core.net.ProxyType</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpComponentBuilder proxyType(
                io.vertx.core.net.ProxyType proxyType) {
            doSetProperty("proxyType", proxyType);
            return this;
        }
        /**
         * The proxy server username if authentication is required.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpComponentBuilder proxyUsername(
                java.lang.String proxyUsername) {
            doSetProperty("proxyUsername", proxyUsername);
            return this;
        }
        /**
         * The password to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default VertxHttpComponentBuilder basicAuthPassword(
                java.lang.String basicAuthPassword) {
            doSetProperty("basicAuthPassword", basicAuthPassword);
            return this;
        }
        /**
         * The user name to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default VertxHttpComponentBuilder basicAuthUsername(
                java.lang.String basicAuthUsername) {
            doSetProperty("basicAuthUsername", basicAuthUsername);
            return this;
        }
        /**
         * The bearer token to use for bearer token authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default VertxHttpComponentBuilder bearerToken(
                java.lang.String bearerToken) {
            doSetProperty("bearerToken", bearerToken);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default VertxHttpComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default VertxHttpComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    }

    class VertxHttpComponentBuilderImpl
            extends
                AbstractComponentBuilder<VertxHttpComponent>
            implements
                VertxHttpComponentBuilder {
        @Override
        protected VertxHttpComponent buildConcreteComponent() {
            return new VertxHttpComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "lazyStartProducer": ((VertxHttpComponent) component).setLazyStartProducer((boolean) value); return true;
            case "allowJavaSerializedObject": ((VertxHttpComponent) component).setAllowJavaSerializedObject((boolean) value); return true;
            case "basicPropertyBinding": ((VertxHttpComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "vertx": ((VertxHttpComponent) component).setVertx((io.vertx.core.Vertx) value); return true;
            case "vertxHttpBinding": ((VertxHttpComponent) component).setVertxHttpBinding((org.apache.camel.component.vertx.http.VertxHttpBinding) value); return true;
            case "vertxOptions": ((VertxHttpComponent) component).setVertxOptions((io.vertx.core.VertxOptions) value); return true;
            case "headerFilterStrategy": ((VertxHttpComponent) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            case "proxyHost": ((VertxHttpComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPassword": ((VertxHttpComponent) component).setProxyPassword((java.lang.String) value); return true;
            case "proxyPort": ((VertxHttpComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyType": ((VertxHttpComponent) component).setProxyType((io.vertx.core.net.ProxyType) value); return true;
            case "proxyUsername": ((VertxHttpComponent) component).setProxyUsername((java.lang.String) value); return true;
            case "basicAuthPassword": ((VertxHttpComponent) component).setBasicAuthPassword((java.lang.String) value); return true;
            case "basicAuthUsername": ((VertxHttpComponent) component).setBasicAuthUsername((java.lang.String) value); return true;
            case "bearerToken": ((VertxHttpComponent) component).setBearerToken((java.lang.String) value); return true;
            case "sslContextParameters": ((VertxHttpComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((VertxHttpComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            default: return false;
            }
        }
    }
}