import UIKit
import Capacitor

/// Custom bridge view controller so we can enable the native
/// swipe-from-left-edge "back" gesture on the WebView, matching
/// standard iOS navigation conventions.
class MainViewController: CAPBridgeViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        self.webView?.allowsBackForwardNavigationGestures = true
    }
}
