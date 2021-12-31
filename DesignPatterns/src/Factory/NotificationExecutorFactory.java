/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;

/**
 *
 * @author hp
 */
public class NotificationExecutorFactory {
   public static NotificationExecutor getNotificationExecutor(String executorType) {
       if(executorType.equals("EMAIL"))
         return new EmailNotificationExecutor();
       if(executorType.equals("SMS"))
         return new SMSNotificationExecutor();
       return null;
     } 
}
