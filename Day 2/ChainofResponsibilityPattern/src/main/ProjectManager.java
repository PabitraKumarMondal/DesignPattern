package main;

public class ProjectManager implements ILeaveRequestHandler {
	
	private ILeaveRequestHandler nextHandler;
		
//	public void setNextHandler(ILeaveRequestHandler nextHandler) {
//		this.nextHandler = nextHandler;
//	}
	
	public ProjectManager() {
		
	}
	
	public ProjectManager(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getLeaveDays() <= 5) {
			System.out.println("Project Manager approves leave request of " + leaveRequest.getEmployee() + " for " + leaveRequest.getLeaveDays() + " days");
		} else {
			nextHandler.HandleRequest(leaveRequest);
		}
	}


}
