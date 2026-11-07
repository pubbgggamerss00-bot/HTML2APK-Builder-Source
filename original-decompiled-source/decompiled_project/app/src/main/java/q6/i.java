package q6;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q6.a;
import q6.g;
import q6.j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22068a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.d f22069b;

    /* renamed from: c, reason: collision with root package name */
    public static final a.h f22070c;

    /* renamed from: d, reason: collision with root package name */
    public static final a.d f22071d;

    /* renamed from: e, reason: collision with root package name */
    public static final a.d f22072e;

    public class a extends a.i {

        /* renamed from: d, reason: collision with root package name */
        public final Pattern f22073d;

        public a() {
            super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
            this.f22073d = Pattern.compile("\\A\\d+");
        }

        @Override // q6.a
        public final boolean d() {
            boolean zD = super.d();
            if (!zD || Build.VERSION.SDK_INT >= 29) {
                return zD;
            }
            int i10 = p6.c.f21338a;
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage == null) {
                return false;
            }
            Matcher matcher = this.f22073d.matcher(currentWebViewPackage.versionName);
            return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public class b extends a.d {
        @Override // q6.a
        public final boolean d() {
            if (!super.d() || !gd.m.c("MULTI_PROCESS")) {
                return false;
            }
            int i10 = p6.c.f21338a;
            if (i.f22069b.d()) {
                return j.b.f22075a.getStatics().isMultiProcessEnabled();
            }
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    static {
        new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        new g.b();
        new g.a();
        new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        f22068a = new a();
        new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        f22069b = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        f22070c = new a.h("FORCE_DARK", "FORCE_DARK");
        f22071d = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        f22072e = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        new b("MULTI_PROFILE", "MULTI_PROFILE");
        new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        new a.d("MUTE_AUDIO", "MUTE_AUDIO");
        new a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        new a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        new a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
    }
}
