package main;

public class HR implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;
		
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		System.out.println("HR approves leave request of " + leaveRequest.getEmployee() + " for " + leaveRequest.getLeaveDays() + " days");
	}

}
