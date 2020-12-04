package com.equalities.cloud.service;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * A class showing the use of Slf4J's Mapped Diagnostic Context
 * to enhance logs written by an application with context-specific
 * information. This can be static information about the service itself, e.g.
 * to be able to filter logs later by service ID, or dynamic information
 * like a tenant ID.
 */
@Component
public class LogEnhancerFilter implements Filter {

    @Override
    public void destroy() {
    }
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        MDC.put("service", "Service-A");
        MDC.put("tenant", "SomeTenantID");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}