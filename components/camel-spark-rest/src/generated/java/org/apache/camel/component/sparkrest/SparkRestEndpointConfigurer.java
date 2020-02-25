/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sparkrest;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SparkRestEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SparkRestEndpoint target = (SparkRestEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accept": target.setAccept(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "disablestreamcache":
        case "disableStreamCache": target.getSparkConfiguration().setDisableStreamCache(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "mapheaders":
        case "mapHeaders": target.getSparkConfiguration().setMapHeaders(property(camelContext, boolean.class, value)); return true;
        case "matchonuriprefix":
        case "matchOnUriPrefix": target.getSparkConfiguration().setMatchOnUriPrefix(property(camelContext, boolean.class, value)); return true;
        case "sparkbinding":
        case "sparkBinding": target.setSparkBinding(property(camelContext, org.apache.camel.component.sparkrest.SparkBinding.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transferexception":
        case "transferException": target.getSparkConfiguration().setTransferException(property(camelContext, boolean.class, value)); return true;
        case "urldecodeheaders":
        case "urlDecodeHeaders": target.getSparkConfiguration().setUrlDecodeHeaders(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
