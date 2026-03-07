package com.sonusantu64.gmail.Module_01_Intro;

// !-- Can't create this interface as Service or Component !! Because interfaces are totally abstract !
// !--> We must make the Declarations as Beans(@Component or @Service) inside the impln folder
public interface NotificationService {
    public void sendNotification(String message);
}
