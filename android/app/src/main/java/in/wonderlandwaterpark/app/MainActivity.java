package in.wonderlandwaterpark.app;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

  @Override
  public void onBackPressed() {
    // If the WebView (whether showing the local shell or the live site) has
    // back history, navigate within the app first instead of exiting.
    if (this.bridge != null && this.bridge.getWebView() != null && this.bridge.getWebView().canGoBack()) {
      this.bridge.getWebView().goBack();
    } else {
      super.onBackPressed();
    }
  }
}
