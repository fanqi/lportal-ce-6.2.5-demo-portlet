package xyz.fanqi.liferay.demo.portlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class LifecycleMVCPortlet
 */
public class LifecyclePortlet extends MVCPortlet {

	@Override
	public void init() throws PortletException {
		System.out.println("Lifecycle Phase (MVCPortlet) : init");
		super.init();
	}

	@Override
	public void init(PortletConfig config) throws PortletException {
		System.out.println("Lifecycle Phase (GenericPortlet) : init");
		super.init(config);
	}

	@Override
	public void render(RenderRequest arg0, RenderResponse arg1)
			throws PortletException, IOException {
		System.out.println("Lifecycle Phase: render");
		super.render(arg0, arg1);
	}

	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		System.out.println("Lifecycle Phase: processAction");
		super.processAction(actionRequest, actionResponse);
	}

	public void doAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		System.out.println("LifecyclePortlet: doAction");
	}

	@Override
	public void processEvent(EventRequest arg0, EventResponse arg1)
			throws PortletException, IOException {
		System.out.println("Lifecycle Phase: processEvent");
		super.processEvent(arg0, arg1);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		System.out.println("Lifecycle Phase: serveResource");
		resourceResponse.setContentType("text/html;charset=UTF-8");
		PrintWriter out = null;
		try {
			out = resourceResponse.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String result = "serveResource";
		out.println(result);
		out.flush();
		out.close();
		super.serveResource(resourceRequest, resourceResponse);
	}

	@Override
	public void destroy() {
		System.out.println("Lifecycle Phase (GenericPortlet) : destroy");
		super.destroy();
	}
}
