/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.mysite.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.mysite.core.services.Calculator;
import com.mysite.core.services.Student;
import com.mysite.core.services.myCompany;

/**
 * Servlet that writes some sample content into the response. It is mounted for
 * all resources of a specific Sling resource type. The
 * {@link SlingSafeMethodsServlet} shall be used for HTTP methods that are
 * idempotent. For write operations use the {@link SlingAllMethodsServlet}.
 */
@Component(service = { Servlet.class })
@SlingServletPaths(value = "/bin/myservlet")
public class SimpleServlet extends SlingSafeMethodsServlet {

    private static final long serialVersionUID = 1L;
    
    @Reference
   Calculator calculator;
// //   myCompany company;
//    Student student;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
    	int a = Integer.parseInt(req.getParameter("a"));
    	
    	// int b = Integer.parseInt(req.getParameter("b"));
   	resp.getWriter().write("Employee Name  : " + a);
//    	String name = (req.getParameter("name"));
//    	String desc = (req.getParameter("desc"));
//    	resp.getWriter().write("Employee Name  : " + student.isClassLimitReached(size)+
//		"/n"+ "Employer Description : " + student.getDescription(marks));
    	
        int switch_case = Integer.parseInt(req.getParameter("switch"));
        
        String student_name = (req.getParameter("name"));
        int student_id = Integer.parseInt(req.getParameter("id"));
        double student_marks = Double.parseDouble(req.getParameter("marks"));
        
        switch(switch_case) {
        case 1:
        	//student.addStudent(student_name,student_id,student_marks);
        	resp.getWriter().write("Student Added Successfully"+" "+student_name+" "+" "+student_id+" " +student_marks);
        	break;
        case 2:
        	resp.getWriter().write("Student Deleted Successfully"+" "+student_name+" "+" "+student_id+" " +student_marks);

        	
        }
//    	resp.getWriter().write("Employee Name  : " + student.isClassLimitReached(size)+
//		"/n"+ "Employer Description : " + student.getDescription(marks));
//    	
    }
}
