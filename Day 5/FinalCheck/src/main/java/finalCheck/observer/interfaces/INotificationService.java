package finalCheck.observer.interfaces;

public interface INotificationService {
	public void AddSubscriber(INotificationObserver obj);
	public void RemoveSubscriber(INotificationObserver obj);
	public void NotifySubscriber();
}
