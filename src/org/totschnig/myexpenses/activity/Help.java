package org.totschnig.myexpenses.activity;

import org.totschnig.myexpenses.dialog.HelpDialogFragment;

import android.os.Bundle;

public class Help extends ProtectedFragmentActivityNoSherlock {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    String activityName = getCallingActivity().getShortClassName();
    //trim leading .
    activityName = activityName.substring(activityName.lastIndexOf(".")+1);
    HelpDialogFragment.newInstance(activityName).show(getSupportFragmentManager(),"HELP");
  }
}
