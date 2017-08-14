package managedbeans;



import javax.faces.event.ActionEvent;

import oracle.ui.pattern.dynamicShell.TabContext;

public class Launcher {
    
    public void createUserActivity(ActionEvent actionEvent) 
      { 
        /** 
        * Example method when called repeatedly, will open another instance as 
        * oppose to selecting a previously opened tab instance. Note the boolean 
        * to create another tab instance is set to true. 
        */ 
          
        _launchActivity( 
          "New User", 
          "/WEB-INF/flows/create-user-taskflow.xml#create-user-taskflow",  
          true); 
      } 
      
      public void ViewUserActivity(ActionEvent actionEvent) 
      { 
          /** 
          * Example method to call a single instance task flow. Note the boolean 
          * to create another tab instance is set to false. The taskflow ID is used 
          * to track whether to create a new tab or select an existing one. 
          */ 
        _launchActivity( 
          "View Users", 
          "/WEB-INF/flows/view-user-taskflow.xml#view-user-taskflow", 
          false); 
      } 
      
      public void editUserActivity(ActionEvent actionEvent) 
      { 
        _launchActivity( 
          "Edit User", 
          "/WEB-INF/flows/edit-user-taskflow.xml#edit-user-taskflow", 
          false); 
      } 
      
      public void futureActivity(ActionEvent actionEvent) 
      { 
        _launchActivity( 
          "Future User", 
          "/WEB-INF/flows/future-taskflow.xml#future-taskflow", 
          false); 
      } 
      
      public void closeCurrentActivity(ActionEvent actionEvent) 
      { 
        TabContext tabContext = TabContext.getCurrentInstance(); 
        int tabIndex = tabContext.getSelectedTabIndex(); 
        if (tabIndex != -1) 
        { 
          tabContext.removeTab(tabIndex); 
        } 
      } 
      
        public void currentTabDirty(ActionEvent e) 
        { 
            /** 
            * When called, marks the current tab "dirty". Only at the View level 
            * is it possible to mark a tab dirty since the model level does not 
            * track to which tab data belongs. 
            */ 
          TabContext tabContext = TabContext.getCurrentInstance(); 
          tabContext.markCurrentTabDirty(true); 
        }  
      
        public void currentTabClean(ActionEvent e) 
        { 
          TabContext tabContext = TabContext.getCurrentInstance(); 
          tabContext.markCurrentTabDirty(false); 
        } 
           
      private void _launchActivity(String title, String taskflowId, boolean newTab) 
      { 
        try 
        { 
          if (newTab) 
          { 
            TabContext.getCurrentInstance().addTab( 
              title, 
              taskflowId); 
          } 
          else 
          { 
            TabContext.getCurrentInstance().addOrSelectTab( 
              title, 
              taskflowId); 
          } 
        } 
        catch (TabContext.TabOverflowException toe) 
        { 
          // causes a dialog to be displayed to the user saying that there are 
          // too many tabs open - the new tab will not be opened... 
          toe.handleDefault();  
        } 
      } 

        public void viewUserReplaceNPlace(ActionEvent actionEvent) 
        { 
          TabContext tabContext = TabContext.getCurrentInstance(); 
          try 
          { 
            tabContext.setMainContent("/WEB-INF/flows/view-user-taskflow.xml#view-user-taskflow"); 
          } 
          catch (TabContext.TabContentAreaDirtyException toe) 
          { 
              // TODO: warn user TabContext api needed for this use case. 
          } 
        } 

        public void launchSecondReplaceNPlace(ActionEvent actionEvent) 
        { 
          TabContext tabContext = TabContext.getCurrentInstance(); 
          try 
          { 
            tabContext.setMainContent("/WEB-INF/flows/second.xml#second"); 
          } 
          catch (TabContext.TabContentAreaDirtyException toe) 
          { 
              // TODO: warn user TabContext api needed for this use case.          
          } 
        } 
    
}
