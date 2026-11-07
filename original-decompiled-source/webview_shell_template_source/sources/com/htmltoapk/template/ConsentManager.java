package com.htmltoapk.template;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.h;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform;
import com.htmltoapk.template.WebViewActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ConsentManager {
    private final WebViewActivity activity;
    private final ConsentManager$backend$1 backend;
    private final p5.l<ConsentSnapshot, d5.j> changed;
    private final WebViewActivity.DisplayConfig config;
    private final boolean debugEnabled;
    private boolean destroyed;
    private final p5.p<String, JSONObject, d5.j> emit;
    private final ConsentFlow flow;
    private final ConsentInformation information;
    private p5.a<d5.j> pendingForm;
    private p5.l<? super String, d5.j> pendingPrivacyResult;
    private TextView privacyButton;

    /* JADX WARN: Multi-variable type inference failed */
    public ConsentManager(WebViewActivity webViewActivity, WebViewActivity.DisplayConfig displayConfig, p5.p<? super String, ? super JSONObject, d5.j> pVar, p5.l<? super ConsentSnapshot, d5.j> lVar) {
        kotlin.jvm.internal.j.e("activity", webViewActivity);
        kotlin.jvm.internal.j.e("config", displayConfig);
        kotlin.jvm.internal.j.e("emit", pVar);
        kotlin.jvm.internal.j.e("changed", lVar);
        this.activity = webViewActivity;
        this.config = displayConfig;
        this.emit = pVar;
        this.changed = lVar;
        this.information = UserMessagingPlatform.getConsentInformation(webViewActivity.getApplicationContext());
        this.debugEnabled = displayConfig.getAdmobUseTestAds() && displayConfig.getUmpDebugEnabled();
        ConsentManager$backend$1 consentManager$backend$1 = new ConsentManager$backend$1(this);
        this.backend = consentManager$backend$1;
        this.flow = new ConsentFlow(consentManager$backend$1, new n0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j flow$lambda$0(ConsentManager consentManager, ConsentSnapshot consentSnapshot) {
        kotlin.jvm.internal.j.e("snapshot", consentSnapshot);
        consentManager.updatePrivacyButton(consentSnapshot);
        consentManager.emit.b("consentStatusChanged", json$default(consentManager, consentSnapshot, null, 2, null));
        consentManager.changed.invoke(consentSnapshot);
        return d5.j.f12745a;
    }

    public static /* synthetic */ JSONObject json$default(ConsentManager consentManager, ConsentSnapshot consentSnapshot, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            consentSnapshot = consentManager.getSnapshot();
        }
        if ((i6 & 2) != 0) {
            str = consentSnapshot.getError();
        }
        return consentManager.json(consentSnapshot, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j showPrivacyOptions$lambda$2(ConsentManager consentManager, String str) {
        consentManager.pendingPrivacyResult = null;
        p5.p<String, JSONObject, d5.j> pVar = consentManager.emit;
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        pVar.b("privacyOptionsResult", json$default(consentManager, null, str, 1, null));
        return d5.j.f12745a;
    }

    private final void updatePrivacyButton(ConsentSnapshot consentSnapshot) {
        if (this.destroyed || this.activity.isFinishing() || this.activity.isDestroyed()) {
            return;
        }
        if (!consentSnapshot.getPrivacyOptionsRequired()) {
            TextView textView = this.privacyButton;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.activity.findViewById(android.R.id.content);
        if (frameLayout == null) {
            return;
        }
        float f6 = this.activity.getResources().getDisplayMetrics().density;
        TextView textView2 = this.privacyButton;
        if (textView2 == null) {
            textView2 = new TextView(this.activity);
            textView2.setText(this.activity.getString(R.string.ads_privacy_options));
            textView2.setContentDescription(textView2.getText());
            textView2.setTextSize(12.0f);
            textView2.setGravity(17);
            textView2.setTextColor(-1);
            textView2.setPadding(updatePrivacyButton$dp(f6, 12), 0, updatePrivacyButton$dp(f6, 12), 0);
            textView2.setMinimumHeight(updatePrivacyButton$dp(f6, 48));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(updatePrivacyButton$dp(f6, 24));
            gradientDrawable.setColor(-584044496);
            textView2.setBackground(gradientDrawable);
            textView2.setElevation(updatePrivacyButton$dp(f6, 4));
            textView2.setOnClickListener(new c4.d(1, this));
            frameLayout.addView(textView2);
            this.privacyButton = textView2;
        }
        int topActionBarHeight = this.activity.getTopActionBarHeight() + this.activity.getSystemBarInsets().f13855b + updatePrivacyButton$dp(f6, 4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, updatePrivacyButton$dp(f6, 48), 8388661);
        layoutParams.topMargin = topActionBarHeight;
        layoutParams.setMarginEnd(updatePrivacyButton$dp(f6, 8));
        textView2.setLayoutParams(layoutParams);
        textView2.setVisibility(0);
        textView2.setEnabled(!consentSnapshot.getInProgress());
        textView2.bringToFront();
    }

    private static final int updatePrivacyButton$dp(float f6, int i6) {
        return (int) (i6 * f6);
    }

    public final boolean canLoadAds() {
        return (this.destroyed || this.activity.isFinishing() || this.activity.isDestroyed() || !this.flow.refresh().getCanRequestAds()) ? false : true;
    }

    public final void destroy() {
        this.destroyed = true;
        this.pendingForm = null;
        this.flow.destroy();
        p5.l<? super String, d5.j> lVar = this.pendingPrivacyResult;
        if (lVar != null) {
            lVar.invoke("activity_destroyed");
        }
        this.pendingPrivacyResult = null;
        TextView textView = this.privacyButton;
        if (textView != null) {
            ViewParent parent = textView.getParent();
            FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
            if (frameLayout != null) {
                frameLayout.removeView(textView);
            }
        }
        this.privacyButton = null;
    }

    public final boolean getDebugEnabled() {
        return this.debugEnabled;
    }

    public final ConsentSnapshot getSnapshot() {
        return this.flow.getSnapshot();
    }

    public final JSONObject json(ConsentSnapshot consentSnapshot, String str) throws JSONException {
        kotlin.jvm.internal.j.e("snapshot", consentSnapshot);
        kotlin.jvm.internal.j.e("error", str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", str.length() == 0);
        jSONObject.put("error", str);
        jSONObject.put("canRequestAds", consentSnapshot.getCanRequestAds());
        jSONObject.put("consentStatus", consentSnapshot.getConsentStatus());
        jSONObject.put("privacyOptionsRequired", consentSnapshot.getPrivacyOptionsRequired());
        jSONObject.put("privacyOptionsStatus", consentSnapshot.getPrivacyOptionsStatus());
        jSONObject.put("inProgress", consentSnapshot.getInProgress());
        jSONObject.put("debugEnabled", this.debugEnabled);
        return jSONObject;
    }

    public final void onResume() {
        if (this.destroyed) {
            return;
        }
        p5.a<d5.j> aVar = this.pendingForm;
        this.pendingForm = null;
        if (aVar != null) {
            aVar.a();
        }
        updatePrivacyButton(getSnapshot());
    }

    public final void resetConsent() {
        String str = (this.destroyed || this.activity.isDestroyed() || this.activity.isFinishing()) ? "activity_destroyed" : !this.debugEnabled ? "debug_disabled" : null;
        if (str != null) {
            this.emit.b("consentResetResult", json$default(this, null, str, 1, null));
            return;
        }
        try {
            this.emit.b("consentResetResult", json$default(this, null, this.flow.reset() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "consent_in_progress", 1, null));
        } catch (Exception unused) {
            this.emit.b("consentResetResult", json$default(this, null, "consent_reset_failed", 1, null));
        }
    }

    public final void showPrivacyOptions() {
        String str = (this.destroyed || this.activity.isDestroyed() || this.activity.isFinishing()) ? "activity_destroyed" : this.activity.getLifecycle().b().compareTo(h.b.f1304w) >= 0 ? this.pendingPrivacyResult != null ? "consent_in_progress" : null : "activity_not_resumed";
        if (str != null) {
            this.emit.b("privacyOptionsResult", json$default(this, null, str, 1, null));
            return;
        }
        androidx.camera.camera2.interop.b bVar = new androidx.camera.camera2.interop.b(this);
        this.pendingPrivacyResult = bVar;
        this.flow.privacyOptions(bVar);
    }

    public final void start() {
        if (this.destroyed || this.activity.isFinishing() || this.activity.isDestroyed()) {
            return;
        }
        this.flow.start();
    }
}
