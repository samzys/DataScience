package proteus.gwt.client.app.event;


import com.google.gwt.event.shared.GwtEvent;

public class LogoutEvent extends
		GwtEvent<LogoutEventHandler> {
	public static Type<LogoutEventHandler> TYPE = new Type<LogoutEventHandler>();


	public LogoutEvent() {
		super();

	}

	@Override
	public Type<LogoutEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(LogoutEventHandler handler) {
		handler.onLogout(this);
	}
}
