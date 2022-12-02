package com.myapp.core.servlets;


import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


@Component(service = Servlet.class, property = { Constants.SERVICE_DESCRIPTION + "=Simple Demo Servlet",
        "sling.servlet.methods=" + HttpConstants.METHOD_POST,
        "sling.servlet.paths=" + "/bin/submitdata2" })
public class SampleSlingPostServlet extends SlingAllMethodsServlet {
    private static final long serialVersionUID = -159625176093879129L;
    private static final Logger log = LoggerFactory.getLogger(SampleSlingPostServlet.class);
    @Override
    protected void doPost(SlingHttpServletRequest req, SlingHttpServletResponse resp) {
        try {
            ResourceResolver resourceResolver = req.getResourceResolver();
            Resource resource = resourceResolver.getResource("/content/myapp/dataNode");
            log.info("Resource is at path {}", resource.getPath());
            Node node = resource.adaptTo(Node.class);
            Node newNode = node.addNode(getNodeName(req,"NodeModel"), "nt:unstructured");

//            newNode.setProperty("name", "Demo NodeModel");
            newNode.setProperty("fname", getRequestParameter(req,"fname"));
            newNode.setProperty("lname", getRequestParameter(req,"lname"));
            newNode.setProperty("age",getRequestParameter(req,"age"));
            newNode.setProperty("phone",getRequestParameter(req,"phone"));
            newNode.setProperty("marks",getRequestParameter(req,"marks"));
            newNode.setProperty("city",getRequestParameter(req,"city"));
            newNode.setProperty("id",getRequestParameter(req,"id"));


//            resp.getWriter().write("Form submitted");
            resp.sendRedirect("/content/myapp/us/en/task3.html");
            resourceResolver.commit();

        } catch (RepositoryException e) {

            log.error(e.getMessage(), e);

            e.printStackTrace();

        } catch (PersistenceException e) {

            log.error(e.getMessage(), e);

            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getRequestParameter(SlingHttpServletRequest request,String s) {
        String var= request.getParameter(s);
        return var;
    }

    public static String getNodeName(SlingHttpServletRequest request,String s) {
        int i=0;
        String fName= request.getParameter("fname");
        String lName= request.getParameter("lname");
        String Age= request.getParameter("age");
        String Phone= request.getParameter("phone");
        String Marks= request.getParameter("marks");
        String City= request.getParameter("city");
        String Id= request.getParameter("id");

        String UserNodeName= "N"+(i++)+"DE"+Id;
        return UserNodeName;
    }
}
