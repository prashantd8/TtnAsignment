package com.myapp.core.services.Impl;


import com.myapp.core.services.BlogService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = BlogService.class, immediate =true)
@Designate(ocd = blogsConfiguration.class)
public class blogsImpl implements BlogService {

	int max_number;

	@Activate
	public void activate(blogsConfiguration config) {

		max_number = config.max_number_config();

	}

	@Override
	public int max_number() {
		return max_number;
	}
}

