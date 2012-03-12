package org.smg.oneclickplugin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;

@ActionID(id = "org.smg.oneclickplugin.CloseAllProjects", category = "File")
@ActionRegistration(iconInMenu = true, displayName = "#CTL_CloseAllProjects")
@ActionReference(path = "Menu/File", position = 750)
public final class CloseAllProjects implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        OpenProjects openProjects = OpenProjects.getDefault();
        Project[] projects = openProjects.getOpenProjects();
        if (projects.length > 0) {
            openProjects.close(projects);
        }
    }
}
