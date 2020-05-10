package main;

public class Program {
	public static void main(String[] args) {
		ILeaveRequestHandler hr = new HR();
		ILeaveRequestHandler projectManager = new ProjectManager(hr);
		ILeaveRequestHandler supervisor = new Supervisor(projectManager);
		
		LeaveRequest leaveRequest1 = new LeaveRequest("Mr. X", 10);
		LeaveRequest leaveRequest2 = new LeaveRequest("Mr. Y", 4);
		LeaveRequest leaveRequest3 = new LeaveRequest("Mr. Z", 2);
		
		supervisor.HandleRequest(leaveRequest1);
		supervisor.HandleRequest(leaveRequest2);
		supervisor.HandleRequest(leaveRequest3);
	}
}
