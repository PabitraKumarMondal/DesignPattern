package main;

public class Supervisor implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;
		
//	public void setNextHandler(ILeaveRequestHandler nextHandler) {
//		this.nextHandler = nextHandler;
//	}
	

	public Supervisor(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}


	public Supervisor() {
		
	}


	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getLeaveDays() <= 3) {
			System.out.println("Supervisor approves leave request of " + leaveRequest.getEmployee() + " for " + leaveRequest.getLeaveDays() + " days");
		} else {
			nextHandler.HandleRequest(leaveRequest);
		}
	}

}
