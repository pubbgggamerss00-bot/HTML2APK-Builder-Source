package com.htmltoapk.template;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.htmltoapk.template.WebViewActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AdMobBridge {
    private final Map<String, p5.a<d5.j>> activeLoads;
    private final WebViewActivity activity;
    private long adEpoch;
    private final Runnable autoShowRunnable;
    private AdView bannerAdView;
    private volatile boolean bannerLoaded;
    private String bannerPosition;
    private volatile boolean bannerWanted;
    private final WebViewActivity.DisplayConfig config;
    private ConsentManager consent;
    private boolean consentWasAllowed;
    private volatile boolean destroyed;
    private final p5.p<String, JSONObject, d5.j> emit;
    private boolean initialLoadsScheduled;
    private String initializationError;
    private boolean initializationStarted;
    private volatile InterstitialAd interstitialAd;
    private volatile boolean isInitialized;
    private long lastInterstitialShowTime;
    private final Map<String, Long> loading;
    private final Map<String, String> loadingKey;
    private final Handler mainHandler;
    private int pageLoadCounter;
    private final PendingAdLoads pendingLoads;
    private boolean resumed;
    private volatile RewardedAd rewardedAd;
    private long ticketCounter;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.htmltoapk.template.AdMobBridge$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.i implements p5.l<ConsentSnapshot, d5.j> {
        public AnonymousClass1(Object obj) {
            super(1, obj, AdMobBridge.class, "onConsentChanged", "onConsentChanged(Lcom/htmltoapk/template/ConsentSnapshot;)V", 0);
        }

        @Override // p5.l
        public /* bridge */ /* synthetic */ d5.j invoke(ConsentSnapshot consentSnapshot) throws JSONException {
            invoke2(consentSnapshot);
            return d5.j.f12745a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ConsentSnapshot consentSnapshot) throws JSONException {
            kotlin.jvm.internal.j.e("p0", consentSnapshot);
            ((AdMobBridge) this.receiver).onConsentChanged(consentSnapshot);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdMobBridge(WebViewActivity webViewActivity, WebViewActivity.DisplayConfig displayConfig, p5.p<? super String, ? super JSONObject, d5.j> pVar) {
        kotlin.jvm.internal.j.e("activity", webViewActivity);
        kotlin.jvm.internal.j.e("config", displayConfig);
        kotlin.jvm.internal.j.e("emit", pVar);
        this.activity = webViewActivity;
        this.config = displayConfig;
        this.emit = pVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainHandler = handler;
        this.bannerPosition = "bottom";
        this.autoShowRunnable = new a(this, 1);
        this.pendingLoads = new PendingAdLoads();
        this.loading = new LinkedHashMap();
        this.loadingKey = new LinkedHashMap();
        this.activeLoads = new LinkedHashMap();
        this.bannerWanted = displayConfig.getAdmobShowBannerOnStart();
        if (isEnabled()) {
            this.consent = new ConsentManager(webViewActivity, displayConfig, pVar, new AnonymousClass1(this));
            handler.post(new f(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AdMobBridge adMobBridge) {
        ConsentManager consentManager = adMobBridge.consent;
        if (consentManager != null) {
            consentManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean acceptLoad(String str, long j6, long j7) {
        Long l4;
        ConsentManager consentManager;
        return !this.destroyed && this.adEpoch == j7 && (l4 = this.loading.get(str)) != null && l4.longValue() == j6 && (consentManager = this.consent) != null && consentManager.canLoadAds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject adEventJson(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str);
        jSONObject.put("adUnitId", str2);
        return jSONObject;
    }

    private final boolean allowShow(String str) throws JSONException {
        String str2;
        ConsentSnapshot snapshot;
        ConsentManager consentManager;
        if (!this.destroyed && !this.activity.isFinishing() && !this.activity.isDestroyed() && this.resumed && this.isInitialized && (consentManager = this.consent) != null && consentManager.canLoadAds()) {
            return true;
        }
        p5.p<String, JSONObject, d5.j> pVar = this.emit;
        JSONObject jSONObjectAdEventJson = adEventJson(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (this.destroyed || this.activity.isFinishing() || this.activity.isDestroyed()) {
            str2 = "activity_destroyed";
        } else if (!this.resumed) {
            str2 = "activity_not_resumed";
        } else if (isEnabled()) {
            ConsentManager consentManager2 = this.consent;
            str2 = (consentManager2 == null || (snapshot = consentManager2.getSnapshot()) == null || !snapshot.getInProgress()) ? "consent_required" : "consent_pending";
        } else {
            str2 = "ads_disabled";
        }
        JSONObject jSONObjectPut = jSONObjectAdEventJson.put("error", str2);
        kotlin.jvm.internal.j.d("put(...)", jSONObjectPut);
        pVar.b("adFailedToShow", jSONObjectPut);
        return false;
    }

    private final void attachBanner(FrameLayout frameLayout, AdView adView) {
        if (adView.getParent() != null) {
            return;
        }
        boolean zA = kotlin.jvm.internal.j.a(this.bannerPosition, "top");
        m0.b systemBarInsets = this.activity.getSystemBarInsets();
        int topActionBarHeight = this.activity.getTopActionBarHeight();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = (zA ? 48 : 80) | 1;
        if (zA) {
            if (topActionBarHeight <= 0) {
                topActionBarHeight = systemBarInsets.f13855b;
            }
            layoutParams.topMargin = topActionBarHeight;
        } else {
            layoutParams.bottomMargin = systemBarInsets.f13857d;
        }
        frameLayout.addView(adView, layoutParams);
        this.activity.updateBannerPadding(true, zA);
    }

    private final void attachVisibleBanner() throws JSONException {
        if (this.bannerWanted && this.resumed && !this.destroyed) {
            if (!allowShow("banner")) {
                String bannerId = getBannerId();
                if (bannerId != null) {
                    loadBanner(bannerId, this.bannerPosition);
                    return;
                }
                return;
            }
            AdView adView = this.bannerAdView;
            if (adView == null) {
                String bannerId2 = getBannerId();
                if (bannerId2 != null) {
                    loadBanner(bannerId2, this.bannerPosition);
                    return;
                } else {
                    emitAdError("adFailedToLoad", "Banner ad is not enabled in Project Settings.", "banner");
                    return;
                }
            }
            FrameLayout frameLayout = (FrameLayout) this.activity.findViewById(android.R.id.content);
            if (frameLayout == null) {
                View viewFindViewById = this.activity.findViewById(R.id.webview);
                ViewParent parent = viewFindViewById != null ? viewFindViewById.getParent() : null;
                frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
            }
            if (frameLayout != null) {
                attachBanner(frameLayout, adView);
            }
            adView.setVisibility(0);
            this.activity.updateBannerPadding(true, kotlin.jvm.internal.j.a(this.bannerPosition, "top"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoShowInterstitialTick() {
        String interstitialId = getInterstitialId();
        if (interstitialId == null) {
            return;
        }
        if (canShowInterstitialNow()) {
            if (this.interstitialAd != null) {
                showInterstitial();
            } else {
                loadInterstitial(interstitialId);
            }
        }
        scheduleAutoShowInterstitial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoShowRunnable$lambda$0(AdMobBridge adMobBridge) {
        adMobBridge.autoShowInterstitialTick();
    }

    private final long beginLoad(String str) {
        long j6 = this.ticketCounter + 1;
        this.ticketCounter = j6;
        this.loading.put(str, Long.valueOf(j6));
        return j6;
    }

    private final AdRequest buildAdRequest() {
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        kotlin.jvm.internal.j.d("build(...)", adRequestBuild);
        return adRequestBuild;
    }

    private final boolean canShowInterstitialNow() {
        long admobInterstitialIntervalSeconds = this.config.getAdmobInterstitialIntervalSeconds() * 1000;
        return admobInterstitialIntervalSeconds <= 0 || System.currentTimeMillis() - this.lastInterstitialShowTime >= admobInterstitialIntervalSeconds;
    }

    private final void emitAdError(String str, String str2, String str3) throws JSONException {
        p5.p<String, JSONObject, d5.j> pVar = this.emit;
        JSONObject jSONObjectAdEventJson = adEventJson(str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        jSONObjectAdEventJson.put("message", str2);
        pVar.b(str, jSONObjectAdEventJson);
    }

    private final void failPending(String str) throws JSONException {
        for (String str2 : this.pendingLoads.clear()) {
            p5.p<String, JSONObject, d5.j> pVar = this.emit;
            JSONObject jSONObjectPut = adEventJson(str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", str).put("message", str);
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut);
            pVar.b("adFailedToLoad", jSONObjectPut);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishLoad(String str, long j6) {
        Long l4 = this.loading.get(str);
        if (l4 != null && l4.longValue() == j6) {
            this.loading.remove(str);
            this.activeLoads.remove(str);
            this.mainHandler.post(new f(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishLoad$lambda$23(AdMobBridge adMobBridge) {
        adMobBridge.flushLoads();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushLoads() {
        ConsentManager consentManager;
        if (this.destroyed || !this.isInitialized || (consentManager = this.consent) == null || !consentManager.canLoadAds()) {
            return;
        }
        if (!this.initialLoadsScheduled) {
            this.initialLoadsScheduled = true;
            String bannerId = getBannerId();
            if (bannerId != null && !this.pendingLoads.contains("banner")) {
                this.pendingLoads.put("banner", new m(0, this, bannerId));
            }
            String interstitialId = getInterstitialId();
            if (interstitialId != null && !this.pendingLoads.contains("interstitial")) {
                this.pendingLoads.put("interstitial", new n(0, this, interstitialId));
            }
            String rewardedId = getRewardedId();
            if (rewardedId != null && !this.pendingLoads.contains("rewarded")) {
                this.pendingLoads.put("rewarded", new o(0, this, rewardedId));
            }
            scheduleAutoShowInterstitial();
        }
        Iterator<T> it = this.pendingLoads.drain().iterator();
        while (it.hasNext()) {
            ((p5.a) it.next()).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j flushLoads$lambda$13$lambda$12(AdMobBridge adMobBridge, String str) {
        adMobBridge.loadBanner(str, adMobBridge.config.getAdmobBannerPosition());
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j flushLoads$lambda$15$lambda$14(AdMobBridge adMobBridge, String str) {
        adMobBridge.loadInterstitial(str);
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j flushLoads$lambda$17$lambda$16(AdMobBridge adMobBridge, String str) {
        adMobBridge.loadRewarded(str);
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FullScreenContentCallback fullScreenCallback(final String str, final String str2, final Object obj) {
        final long j6 = this.adEpoch;
        return new FullScreenContentCallback() { // from class: com.htmltoapk.template.AdMobBridge.fullScreenCallback.1
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                if (AdMobBridge.this.destroyed || AdMobBridge.this.activity.isFinishing() || AdMobBridge.this.activity.isDestroyed() || AdMobBridge.this.adEpoch != j6) {
                    return;
                }
                AdMobBridge.this.emit.b("adDismissed", AdMobBridge.this.adEventJson(str, str2));
                if (kotlin.jvm.internal.j.a(str, "interstitial")) {
                    if (AdMobBridge.this.interstitialAd == obj) {
                        AdMobBridge.this.interstitialAd = null;
                    }
                    String interstitialId = AdMobBridge.this.getInterstitialId();
                    if (AdMobBridge.this.interstitialAd == null && interstitialId != null && (AdMobBridge.this.config.getAdmobAutoLoadInterstitial() || AdMobBridge.this.config.getAdmobInterstitialIntervalSeconds() > 0 || AdMobBridge.this.config.getAdmobInterstitialPageCount() > 0)) {
                        AdMobBridge.this.loadInterstitial(interstitialId);
                    }
                }
                if (kotlin.jvm.internal.j.a(str, "rewarded")) {
                    if (AdMobBridge.this.rewardedAd == obj) {
                        AdMobBridge.this.rewardedAd = null;
                    }
                    String rewardedId = AdMobBridge.this.getRewardedId();
                    if (AdMobBridge.this.rewardedAd != null || rewardedId == null) {
                        return;
                    }
                    if (AdMobBridge.this.config.getAdmobAutoLoadRewarded() || AdMobBridge.this.config.getAdmobRewardedEnabled()) {
                        AdMobBridge.this.loadRewarded(rewardedId);
                    }
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) throws JSONException {
                String rewardedId;
                String interstitialId;
                kotlin.jvm.internal.j.e("error", adError);
                if (AdMobBridge.this.destroyed || AdMobBridge.this.activity.isFinishing() || AdMobBridge.this.activity.isDestroyed() || AdMobBridge.this.adEpoch != j6) {
                    return;
                }
                p5.p pVar = AdMobBridge.this.emit;
                JSONObject jSONObjectAdEventJson = AdMobBridge.this.adEventJson(str, str2);
                jSONObjectAdEventJson.put("code", adError.getCode());
                jSONObjectAdEventJson.put("message", adError.getMessage());
                pVar.b("adFailedToShow", jSONObjectAdEventJson);
                if (kotlin.jvm.internal.j.a(str, "interstitial")) {
                    if (AdMobBridge.this.interstitialAd == obj) {
                        AdMobBridge.this.interstitialAd = null;
                    }
                    if (AdMobBridge.this.interstitialAd == null && (interstitialId = AdMobBridge.this.getInterstitialId()) != null) {
                        AdMobBridge.this.loadInterstitial(interstitialId);
                    }
                }
                if (kotlin.jvm.internal.j.a(str, "rewarded")) {
                    if (AdMobBridge.this.rewardedAd == obj) {
                        AdMobBridge.this.rewardedAd = null;
                    }
                    if (AdMobBridge.this.rewardedAd != null || (rewardedId = AdMobBridge.this.getRewardedId()) == null) {
                        return;
                    }
                    AdMobBridge.this.loadRewarded(rewardedId);
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                AdMobBridge.this.emit.b("adShowedFullScreenContent", AdMobBridge.this.adEventJson(str, str2));
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j hideBanner$lambda$32(AdMobBridge adMobBridge) {
        adMobBridge.bannerWanted = false;
        AdView adView = adMobBridge.bannerAdView;
        if (adView != null) {
            adView.setVisibility(8);
        }
        adMobBridge.activity.updateBannerPadding(false, kotlin.jvm.internal.j.a(adMobBridge.bannerPosition, "top"));
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeFromJs$lambda$3(AdMobBridge adMobBridge) throws JSONException {
        p5.p<String, JSONObject, d5.j> pVar = adMobBridge.emit;
        JSONObject jSONObjectPut = adMobBridge.consentStatusJson().put("initialized", adMobBridge.isInitialized);
        kotlin.jvm.internal.j.d("put(...)", jSONObjectPut);
        pVar.b("adResult", jSONObjectPut);
    }

    private final void initializeSdkOnce() throws JSONException {
        if (this.initializationStarted || this.destroyed) {
            return;
        }
        this.initializationStarted = true;
        try {
            MobileAds.setRequestConfiguration(AdPrivacySettingsKt.adRequestConfiguration(this.config));
            MobileAds.initialize(this.activity, new OnInitializationCompleteListener() { // from class: com.htmltoapk.template.l
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    AdMobBridge.initializeSdkOnce$lambda$11(this.f12582a, initializationStatus);
                }
            });
        } catch (Exception e6) {
            this.initializationError = "ad_initialization_failed";
            Log.e("AdMobBridge", "Ad initialization failed", e6);
            failPending("ad_initialization_failed");
            p5.p<String, JSONObject, d5.j> pVar = this.emit;
            JSONObject jSONObjectPut = new JSONObject().put("error", "ad_initialization_failed");
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut);
            pVar.b("adInitFailed", jSONObjectPut);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSdkOnce$lambda$11(AdMobBridge adMobBridge, InitializationStatus initializationStatus) {
        kotlin.jvm.internal.j.e("status", initializationStatus);
        adMobBridge.mainHandler.post(new androidx.activity.p(3, adMobBridge, initializationStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSdkOnce$lambda$11$lambda$10(AdMobBridge adMobBridge, InitializationStatus initializationStatus) throws JSONException {
        int i6;
        if (adMobBridge.destroyed || adMobBridge.activity.isFinishing() || adMobBridge.activity.isDestroyed()) {
            return;
        }
        adMobBridge.isInitialized = true;
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        kotlin.jvm.internal.j.d("getAdapterStatusMap(...)", adapterStatusMap);
        Collection<AdapterStatus> collectionValues = adapterStatusMap.values();
        if (collectionValues == null || !collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            i6 = 0;
            while (it.hasNext()) {
                if (((AdapterStatus) it.next()).getInitializationState() != AdapterStatus.State.READY && (i6 = i6 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        } else {
            i6 = 0;
        }
        p5.p<String, JSONObject, d5.j> pVar = adMobBridge.emit;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", i6 == 0);
        jSONObject.put("adapterCount", adapterStatusMap.size());
        jSONObject.put("notInitialized", i6);
        jSONObject.put("error", i6 > 0 ? "adapter_not_initialized" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        pVar.b("admobInitialized", jSONObject);
        adMobBridge.flushLoads();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j loadBanner$lambda$26(final AdMobBridge adMobBridge, String str, final String str2) throws JSONException {
        final long jBeginLoad = adMobBridge.beginLoad("banner");
        final long j6 = adMobBridge.adEpoch;
        adMobBridge.removeBanner();
        String str3 = "top";
        if (!kotlin.jvm.internal.j.a(str, "top") && (kotlin.jvm.internal.j.a(str, "bottom") || !kotlin.jvm.internal.j.a(adMobBridge.config.getAdmobBannerPosition(), "top"))) {
            str3 = "bottom";
        }
        adMobBridge.bannerPosition = str3;
        final AdView adView = new AdView(adMobBridge.activity);
        adView.setAdUnitId(str2);
        adView.setAdSize(AdSize.BANNER);
        adMobBridge.bannerAdView = adView;
        adView.setAdListener(new AdListener() { // from class: com.htmltoapk.template.AdMobBridge$loadBanner$1$1
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) throws JSONException {
                ConsentManager consentManager;
                kotlin.jvm.internal.j.e("error", loadAdError);
                if (!this.this$0.destroyed && this.this$0.adEpoch == j6 && this.this$0.bannerAdView == adView && (consentManager = this.this$0.consent) != null && consentManager.canLoadAds()) {
                    this.this$0.finishLoad("banner", jBeginLoad);
                    this.this$0.bannerLoaded = false;
                    p5.p pVar = this.this$0.emit;
                    JSONObject jSONObjectAdEventJson = this.this$0.adEventJson("banner", str2);
                    jSONObjectAdEventJson.put("code", loadAdError.getCode());
                    jSONObjectAdEventJson.put("message", loadAdError.getMessage());
                    pVar.b("adFailedToLoad", jSONObjectAdEventJson);
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                ConsentManager consentManager;
                if (!this.this$0.destroyed && this.this$0.adEpoch == j6 && this.this$0.bannerAdView == adView && (consentManager = this.this$0.consent) != null && consentManager.canLoadAds()) {
                    this.this$0.finishLoad("banner", jBeginLoad);
                    this.this$0.bannerLoaded = true;
                    this.this$0.emit.b("adLoaded", this.this$0.adEventJson("banner", str2));
                }
            }
        });
        adView.loadAd(adMobBridge.buildAdRequest());
        if (adMobBridge.bannerWanted) {
            adMobBridge.attachVisibleBanner();
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j loadInterstitial$lambda$39(final AdMobBridge adMobBridge, final String str) {
        final long jBeginLoad = adMobBridge.beginLoad("interstitial");
        final long j6 = adMobBridge.adEpoch;
        InterstitialAd.load(adMobBridge.activity, str, adMobBridge.buildAdRequest(), new InterstitialAdLoadCallback() { // from class: com.htmltoapk.template.AdMobBridge$loadInterstitial$1$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) throws JSONException {
                kotlin.jvm.internal.j.e("error", loadAdError);
                if (this.this$0.acceptLoad("interstitial", jBeginLoad, j6)) {
                    this.this$0.finishLoad("interstitial", jBeginLoad);
                    this.this$0.interstitialAd = null;
                    p5.p pVar = this.this$0.emit;
                    JSONObject jSONObjectAdEventJson = this.this$0.adEventJson("interstitial", str);
                    jSONObjectAdEventJson.put("code", loadAdError.getCode());
                    jSONObjectAdEventJson.put("message", loadAdError.getMessage());
                    pVar.b("adFailedToLoad", jSONObjectAdEventJson);
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                kotlin.jvm.internal.j.e("ad", interstitialAd);
                if (this.this$0.acceptLoad("interstitial", jBeginLoad, j6)) {
                    this.this$0.finishLoad("interstitial", jBeginLoad);
                    this.this$0.interstitialAd = interstitialAd;
                    interstitialAd.setFullScreenContentCallback(this.this$0.fullScreenCallback("interstitial", str, interstitialAd));
                    this.this$0.emit.b("adLoaded", this.this$0.adEventJson("interstitial", str));
                }
            }
        });
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j loadRewarded$lambda$43(final AdMobBridge adMobBridge, final String str) {
        final long jBeginLoad = adMobBridge.beginLoad("rewarded");
        final long j6 = adMobBridge.adEpoch;
        RewardedAd.load(adMobBridge.activity, str, adMobBridge.buildAdRequest(), new RewardedAdLoadCallback() { // from class: com.htmltoapk.template.AdMobBridge$loadRewarded$1$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) throws JSONException {
                kotlin.jvm.internal.j.e("error", loadAdError);
                if (this.this$0.acceptLoad("rewarded", jBeginLoad, j6)) {
                    this.this$0.finishLoad("rewarded", jBeginLoad);
                    this.this$0.rewardedAd = null;
                    p5.p pVar = this.this$0.emit;
                    JSONObject jSONObjectAdEventJson = this.this$0.adEventJson("rewarded", str);
                    jSONObjectAdEventJson.put("code", loadAdError.getCode());
                    jSONObjectAdEventJson.put("message", loadAdError.getMessage());
                    pVar.b("adFailedToLoad", jSONObjectAdEventJson);
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedAd rewardedAd) {
                kotlin.jvm.internal.j.e("ad", rewardedAd);
                if (this.this$0.acceptLoad("rewarded", jBeginLoad, j6)) {
                    this.this$0.finishLoad("rewarded", jBeginLoad);
                    this.this$0.rewardedAd = rewardedAd;
                    rewardedAd.setFullScreenContentCallback(this.this$0.fullScreenCallback("rewarded", str, rewardedAd));
                    this.this$0.emit.b("adLoaded", this.this$0.adEventJson("rewarded", str));
                }
            }
        });
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConsentChanged(ConsentSnapshot consentSnapshot) throws JSONException {
        if (this.destroyed) {
            return;
        }
        boolean z6 = this.consentWasAllowed;
        this.consentWasAllowed = consentSnapshot.getCanRequestAds();
        if (consentSnapshot.getCanRequestAds()) {
            initializeSdkOnce();
            flushLoads();
            return;
        }
        if (z6) {
            this.adEpoch++;
            for (Map.Entry<String, p5.a<d5.j>> entry : this.activeLoads.entrySet()) {
                final String key = entry.getKey();
                final p5.a<d5.j> value = entry.getValue();
                final String str = this.loadingKey.get(key);
                if (str == null) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                if (!this.pendingLoads.contains(key)) {
                    this.pendingLoads.put(key, new p5.a() { // from class: com.htmltoapk.template.d
                        @Override // p5.a
                        public final Object a() {
                            return AdMobBridge.onConsentChanged$lambda$7$lambda$6(this.s, key, str, value);
                        }
                    });
                }
                p5.p<String, JSONObject, d5.j> pVar = this.emit;
                JSONObject jSONObjectPut = adEventJson(key, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", "consent_pending");
                kotlin.jvm.internal.j.d("put(...)", jSONObjectPut);
                pVar.b("adDeferred", jSONObjectPut);
            }
            this.activeLoads.clear();
            this.loading.clear();
            this.loadingKey.clear();
            removeBanner();
            this.interstitialAd = null;
            this.rewardedAd = null;
            this.initialLoadsScheduled = false;
            this.mainHandler.removeCallbacks(this.autoShowRunnable);
        }
        if (consentSnapshot.getInProgress()) {
            return;
        }
        failPending("consent_required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j onConsentChanged$lambda$7$lambda$6(AdMobBridge adMobBridge, String str, String str2, p5.a aVar) {
        adMobBridge.withAdPermission(str, str2, aVar);
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$51(AdMobBridge adMobBridge) {
        ConsentManager consentManager;
        if (!adMobBridge.resumed || adMobBridge.destroyed || (consentManager = adMobBridge.consent) == null) {
            return;
        }
        consentManager.onResume();
    }

    private final void removeBanner() {
        AdView adView = this.bannerAdView;
        if (adView != null) {
            ViewParent parent = adView.getParent();
            if (parent != null) {
                FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
                if (frameLayout != null) {
                    frameLayout.removeView(adView);
                }
            }
            adView.destroy();
        }
        this.bannerAdView = null;
        this.bannerLoaded = false;
        this.activity.updateBannerPadding(false, kotlin.jvm.internal.j.a(this.bannerPosition, "top"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetConsent$lambda$5(AdMobBridge adMobBridge) {
        ConsentManager consentManager = adMobBridge.consent;
        if (consentManager != null) {
            consentManager.resetConsent();
        } else {
            adMobBridge.emit.b("consentResetResult", adMobBridge.consentStatusJson());
        }
    }

    private final void runOnUiThread(p5.a<d5.j> aVar) {
        this.mainHandler.post(new androidx.activity.j(4, aVar));
    }

    private final void scheduleAutoShowInterstitial() {
        this.mainHandler.removeCallbacks(this.autoShowRunnable);
        long admobInterstitialIntervalSeconds = this.config.getAdmobInterstitialIntervalSeconds() * 1000;
        if (!this.destroyed && this.resumed && this.isInitialized && canRequestAds() && admobInterstitialIntervalSeconds > 0) {
            this.mainHandler.postDelayed(this.autoShowRunnable, admobInterstitialIntervalSeconds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j setBannerPosition$lambda$35(String str, AdMobBridge adMobBridge) {
        String str2 = x5.l.k(str, "top") ? "top" : "bottom";
        boolean zA = kotlin.jvm.internal.j.a(adMobBridge.bannerPosition, str2);
        d5.j jVar = d5.j.f12745a;
        if (!zA) {
            adMobBridge.bannerPosition = str2;
            AdView adView = adMobBridge.bannerAdView;
            if (adView != null) {
                ViewParent parent = adView.getParent();
                FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
                if (frameLayout != null) {
                    frameLayout.removeView(adView);
                    adMobBridge.attachBanner(frameLayout, adView);
                }
            }
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j showBanner$lambda$27(AdMobBridge adMobBridge) throws JSONException {
        adMobBridge.bannerWanted = true;
        adMobBridge.attachVisibleBanner();
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j showInterstitial$lambda$42(AdMobBridge adMobBridge) throws JSONException {
        d5.j jVar = d5.j.f12745a;
        if (!adMobBridge.allowShow("interstitial")) {
            return jVar;
        }
        if (!adMobBridge.canShowInterstitialNow()) {
            p5.p<String, JSONObject, d5.j> pVar = adMobBridge.emit;
            JSONObject jSONObjectPut = adMobBridge.adEventJson("interstitial", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("reason", "frequency_capped");
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut);
            pVar.b("adSkipped", jSONObjectPut);
            return jVar;
        }
        InterstitialAd interstitialAd = adMobBridge.interstitialAd;
        String interstitialId = adMobBridge.getInterstitialId();
        if (interstitialAd != null) {
            adMobBridge.lastInterstitialShowTime = System.currentTimeMillis();
            interstitialAd.show(adMobBridge.activity);
            return jVar;
        }
        if (interstitialId == null) {
            p5.p<String, JSONObject, d5.j> pVar2 = adMobBridge.emit;
            JSONObject jSONObjectAdEventJson = adMobBridge.adEventJson("interstitial", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            jSONObjectAdEventJson.put("message", "Interstitial ad is not enabled in Project Settings.");
            pVar2.b("adFailedToShow", jSONObjectAdEventJson);
            return jVar;
        }
        adMobBridge.loadInterstitial(interstitialId);
        p5.p<String, JSONObject, d5.j> pVar3 = adMobBridge.emit;
        JSONObject jSONObjectAdEventJson2 = adMobBridge.adEventJson("interstitial", interstitialId);
        jSONObjectAdEventJson2.put("message", "Interstitial ad is loading in background. Please try again in a few seconds.");
        pVar3.b("adFailedToShow", jSONObjectAdEventJson2);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPrivacyOptions$lambda$4(AdMobBridge adMobBridge) {
        ConsentManager consentManager = adMobBridge.consent;
        if (consentManager != null) {
            consentManager.showPrivacyOptions();
        } else {
            adMobBridge.emit.b("privacyOptionsResult", adMobBridge.consentStatusJson());
        }
    }

    public static /* synthetic */ void showRewarded$default(AdMobBridge adMobBridge, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = null;
        }
        adMobBridge.showRewarded(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j showRewarded$lambda$50(final AdMobBridge adMobBridge, final String str) throws JSONException {
        d5.j jVar = d5.j.f12745a;
        if (!adMobBridge.allowShow("rewarded")) {
            return jVar;
        }
        if (!adMobBridge.isEnabled()) {
            adMobBridge.emitAdError("adFailedToShow", "AdMob is disabled in Project Settings (Step 8: Ads). Please enable AdMob to display ads.", "rewarded");
            return jVar;
        }
        RewardedAd rewardedAd = adMobBridge.rewardedAd;
        String rewardedId = adMobBridge.getRewardedId();
        if (rewardedAd != null) {
            final long j6 = adMobBridge.adEpoch;
            rewardedAd.show(adMobBridge.activity, new OnUserEarnedRewardListener() { // from class: com.htmltoapk.template.p
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) throws JSONException {
                    AdMobBridge.showRewarded$lambda$50$lambda$47(this.s, j6, str, rewardItem);
                }
            });
            return jVar;
        }
        if (rewardedId == null) {
            p5.p<String, JSONObject, d5.j> pVar = adMobBridge.emit;
            JSONObject jSONObjectAdEventJson = adMobBridge.adEventJson("rewarded", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            jSONObjectAdEventJson.put("message", "Rewarded ad is not enabled in Project Settings.");
            pVar.b("adFailedToShow", jSONObjectAdEventJson);
            return jVar;
        }
        adMobBridge.loadRewarded(rewardedId);
        p5.p<String, JSONObject, d5.j> pVar2 = adMobBridge.emit;
        JSONObject jSONObjectAdEventJson2 = adMobBridge.adEventJson("rewarded", rewardedId);
        jSONObjectAdEventJson2.put("message", "Rewarded ad is loading in background. Please try again in a few seconds.");
        pVar2.b("adFailedToShow", jSONObjectAdEventJson2);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRewarded$lambda$50$lambda$47(AdMobBridge adMobBridge, long j6, String str, RewardItem rewardItem) throws JSONException {
        kotlin.jvm.internal.j.e("reward", rewardItem);
        if (adMobBridge.destroyed || adMobBridge.activity.isDestroyed() || adMobBridge.activity.isFinishing() || adMobBridge.adEpoch != j6) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", rewardItem.getType());
        jSONObject.put("amount", rewardItem.getAmount());
        adMobBridge.emit.b("rewardEarned", jSONObject);
        if (str != null) {
            if (!adMobBridge.activity.isTrustedPageShown$template_adsRelease()) {
                str = null;
            }
            if (str != null) {
                int amount = rewardItem.getAmount();
                String strQuote = JSONObject.quote(rewardItem.getType());
                StringBuilder sbA = androidx.camera.camera2.internal.i0.a("window.", str, " && window.", str, "(");
                sbA.append(amount);
                sbA.append(", ");
                sbA.append(strQuote);
                sbA.append(")");
                adMobBridge.activity.getWebView().evaluateJavascript(sbA.toString(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j updateBannerMargins$lambda$37(AdMobBridge adMobBridge) {
        AdView adView = adMobBridge.bannerAdView;
        d5.j jVar = d5.j.f12745a;
        if (adView == null) {
            return jVar;
        }
        boolean zA = kotlin.jvm.internal.j.a(adMobBridge.bannerPosition, "top");
        m0.b systemBarInsets = adMobBridge.activity.getSystemBarInsets();
        int topActionBarHeight = adMobBridge.activity.getTopActionBarHeight();
        ViewGroup.LayoutParams layoutParams = adView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = (zA ? 48 : 80) | 1;
            if (zA) {
                if (topActionBarHeight <= 0) {
                    topActionBarHeight = systemBarInsets.f13855b;
                }
                layoutParams2.topMargin = topActionBarHeight;
                layoutParams2.bottomMargin = 0;
            } else {
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = systemBarInsets.f13857d;
            }
            adView.setLayoutParams(layoutParams2);
        }
        return jVar;
    }

    private final void withAdPermission(final String str, final String str2, final p5.a<d5.j> aVar) {
        this.mainHandler.post(new Runnable() { // from class: com.htmltoapk.template.i
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                AdMobBridge.withAdPermission$lambda$21(this.s, str, str2, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withAdPermission$lambda$21(final AdMobBridge adMobBridge, final String str, final String str2, final p5.a aVar) throws JSONException {
        ConsentSnapshot snapshot;
        ConsentManager consentManager;
        boolean z6 = adMobBridge.destroyed;
        String str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (z6 || adMobBridge.activity.isDestroyed() || adMobBridge.activity.isFinishing()) {
            p5.p<String, JSONObject, d5.j> pVar = adMobBridge.emit;
            JSONObject jSONObjectPut = adMobBridge.adEventJson(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", "activity_destroyed");
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut);
            pVar.b("adFailedToLoad", jSONObjectPut);
            return;
        }
        if (!adMobBridge.isEnabled()) {
            p5.p<String, JSONObject, d5.j> pVar2 = adMobBridge.emit;
            JSONObject jSONObjectPut2 = adMobBridge.adEventJson(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", "ads_disabled");
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut2);
            pVar2.b("adFailedToLoad", jSONObjectPut2);
            return;
        }
        if (adMobBridge.initializationError != null) {
            p5.p<String, JSONObject, d5.j> pVar3 = adMobBridge.emit;
            JSONObject jSONObjectPut3 = adMobBridge.adEventJson(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", adMobBridge.initializationError);
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut3);
            pVar3.b("adFailedToLoad", jSONObjectPut3);
            return;
        }
        if (adMobBridge.loading.containsKey(str) && kotlin.jvm.internal.j.a(adMobBridge.loadingKey.get(str), str2) && (consentManager = adMobBridge.consent) != null && consentManager.canLoadAds()) {
            p5.p<String, JSONObject, d5.j> pVar4 = adMobBridge.emit;
            JSONObject jSONObjectPut4 = adMobBridge.adEventJson(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", "already_loading");
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut4);
            pVar4.b("adDeferred", jSONObjectPut4);
            return;
        }
        ConsentManager consentManager2 = adMobBridge.consent;
        if (consentManager2 == null || !consentManager2.canLoadAds() || !adMobBridge.isInitialized || adMobBridge.loading.containsKey(str)) {
            ConsentManager consentManager3 = adMobBridge.consent;
            if (consentManager3 != null && (snapshot = consentManager3.getSnapshot()) != null && !snapshot.getInProgress() && !adMobBridge.canRequestAds()) {
                p5.p<String, JSONObject, d5.j> pVar5 = adMobBridge.emit;
                JSONObject jSONObjectPut5 = adMobBridge.adEventJson(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", "consent_required");
                kotlin.jvm.internal.j.d("put(...)", jSONObjectPut5);
                pVar5.b("adFailedToLoad", jSONObjectPut5);
                return;
            }
            boolean zPut = adMobBridge.pendingLoads.put(str, new p5.a() { // from class: com.htmltoapk.template.k
                @Override // p5.a
                public final Object a() {
                    return AdMobBridge.withAdPermission$lambda$21$lambda$20(this.s, str, str2, aVar);
                }
            });
            p5.p<String, JSONObject, d5.j> pVar6 = adMobBridge.emit;
            JSONObject jSONObjectPut6 = adMobBridge.adEventJson(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", zPut ? "superseded" : "consent_or_sdk_pending");
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut6);
            pVar6.b("adDeferred", jSONObjectPut6);
            return;
        }
        try {
            adMobBridge.loadingKey.put(str, str2);
            adMobBridge.activeLoads.put(str, aVar);
            aVar.a();
        } catch (Exception e6) {
            adMobBridge.activeLoads.remove(str);
            adMobBridge.loading.remove(str);
            p5.p<String, JSONObject, d5.j> pVar7 = adMobBridge.emit;
            JSONObject jSONObjectPut7 = adMobBridge.adEventJson(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", "ad_load_failed");
            String message = e6.getMessage();
            if (message != null) {
                str3 = message;
            }
            JSONObject jSONObjectPut8 = jSONObjectPut7.put("message", str3);
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut8);
            pVar7.b("adFailedToLoad", jSONObjectPut8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j withAdPermission$lambda$21$lambda$20(AdMobBridge adMobBridge, String str, String str2, p5.a aVar) {
        adMobBridge.withAdPermission(str, str2, aVar);
        return d5.j.f12745a;
    }

    public final boolean canRequestAds() {
        ConsentSnapshot snapshot;
        ConsentManager consentManager = this.consent;
        return (consentManager == null || (snapshot = consentManager.getSnapshot()) == null || !snapshot.getCanRequestAds() || this.destroyed) ? false : true;
    }

    public final JSONObject consentStatusJson() throws JSONException {
        JSONObject jSONObjectJson$default;
        ConsentManager consentManager = this.consent;
        if (consentManager != null && (jSONObjectJson$default = ConsentManager.json$default(consentManager, null, null, 3, null)) != null) {
            return jSONObjectJson$default;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("error", "ads_disabled");
        jSONObject.put("canRequestAds", false);
        jSONObject.put("consentStatus", "UNKNOWN");
        jSONObject.put("privacyOptionsRequired", false);
        jSONObject.put("privacyOptionsStatus", "UNKNOWN");
        jSONObject.put("inProgress", false);
        jSONObject.put("debugEnabled", false);
        return jSONObject;
    }

    public final void destroy() throws JSONException {
        this.destroyed = true;
        this.adEpoch++;
        this.mainHandler.removeCallbacksAndMessages(null);
        ConsentManager consentManager = this.consent;
        if (consentManager != null) {
            consentManager.destroy();
        }
        failPending("activity_destroyed");
        for (String str : this.activeLoads.keySet()) {
            p5.p<String, JSONObject, d5.j> pVar = this.emit;
            JSONObject jSONObjectPut = adEventJson(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).put("error", "activity_destroyed");
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut);
            pVar.b("adFailedToLoad", jSONObjectPut);
        }
        this.activeLoads.clear();
        this.loading.clear();
        removeBanner();
        this.interstitialAd = null;
        this.rewardedAd = null;
    }

    public final String getBannerId() {
        if (!this.config.getAdmobEnabled()) {
            return null;
        }
        if (this.config.getAdmobUseTestAds()) {
            return AdMobTestIds.BANNER;
        }
        if (!this.config.getAdmobBannerEnabled() || x5.o.v(this.config.getAdmobBannerUnitId())) {
            return null;
        }
        return x5.o.G(this.config.getAdmobBannerUnitId()).toString();
    }

    public final String getInterstitialId() {
        if (!this.config.getAdmobEnabled()) {
            return null;
        }
        if (this.config.getAdmobUseTestAds()) {
            return AdMobTestIds.INTERSTITIAL;
        }
        if (!this.config.getAdmobInterstitialEnabled() || x5.o.v(this.config.getAdmobInterstitialUnitId())) {
            return null;
        }
        return x5.o.G(this.config.getAdmobInterstitialUnitId()).toString();
    }

    public final String getRewardedId() {
        if (!this.config.getAdmobEnabled()) {
            return null;
        }
        if (this.config.getAdmobUseTestAds()) {
            return AdMobTestIds.REWARDED;
        }
        if (!this.config.getAdmobRewardedEnabled() || x5.o.v(this.config.getAdmobRewardedUnitId())) {
            return null;
        }
        return x5.o.G(this.config.getAdmobRewardedUnitId()).toString();
    }

    public final void hideBanner() {
        runOnUiThread(new g(this, 1));
    }

    public final void initializeFromJs() {
        this.mainHandler.post(new androidx.activity.o(4, this));
    }

    public final boolean isBannerLoaded() {
        return this.bannerLoaded;
    }

    public final boolean isEnabled() {
        if (this.config.getAdmobEnabled()) {
            return this.config.getAdmobUseTestAds() || !x5.o.v(this.config.getAdmobAppId());
        }
        return false;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public final boolean isInterstitialLoaded() {
        return this.interstitialAd != null;
    }

    public final boolean isPrivacyOptionsRequired() {
        ConsentSnapshot snapshot;
        ConsentManager consentManager = this.consent;
        return (consentManager == null || (snapshot = consentManager.getSnapshot()) == null || !snapshot.getPrivacyOptionsRequired()) ? false : true;
    }

    public final boolean isRewardedLoaded() {
        return this.rewardedAd != null;
    }

    public final void loadBanner(String str, String str2) {
        kotlin.jvm.internal.j.e("adUnitId", str);
        kotlin.jvm.internal.j.e("position", str2);
        String strAdUnitIdForRequest = AdPrivacySettingsKt.adUnitIdForRequest(this.config, "banner", str);
        if (isEnabled()) {
            withAdPermission("banner", androidx.activity.m.d(strAdUnitIdForRequest, "|", str2), new j(this, str2, strAdUnitIdForRequest, 0));
        } else {
            emitAdError("adFailedToLoad", "AdMob not configured", "banner");
        }
    }

    public final void loadInterstitial(String str) {
        kotlin.jvm.internal.j.e("adUnitId", str);
        String strAdUnitIdForRequest = AdPrivacySettingsKt.adUnitIdForRequest(this.config, "interstitial", str);
        if (isEnabled()) {
            withAdPermission("interstitial", strAdUnitIdForRequest, new u(2, this, strAdUnitIdForRequest));
        } else {
            emitAdError("adFailedToLoad", "AdMob not configured", "interstitial");
        }
    }

    public final void loadRewarded(String str) {
        kotlin.jvm.internal.j.e("adUnitId", str);
        String strAdUnitIdForRequest = AdPrivacySettingsKt.adUnitIdForRequest(this.config, "rewarded", str);
        if (isEnabled()) {
            withAdPermission("rewarded", strAdUnitIdForRequest, new c(0, this, strAdUnitIdForRequest));
        } else {
            emitAdError("adFailedToLoad", "AdMob not configured", "rewarded");
        }
    }

    public final void onPageLoaded() {
        int admobInterstitialPageCount = this.config.getAdmobInterstitialPageCount();
        if (admobInterstitialPageCount <= 0) {
            return;
        }
        int i6 = this.pageLoadCounter + 1;
        this.pageLoadCounter = i6;
        if (i6 >= admobInterstitialPageCount) {
            this.pageLoadCounter = 0;
            String interstitialId = getInterstitialId();
            if (interstitialId == null) {
                return;
            }
            if (this.interstitialAd != null) {
                showInterstitial();
            } else {
                loadInterstitial(interstitialId);
            }
        }
    }

    public final void onPause() {
        this.resumed = false;
        this.mainHandler.removeCallbacks(this.autoShowRunnable);
        AdView adView = this.bannerAdView;
        if (adView != null) {
            adView.pause();
        }
    }

    public final void onResume() throws JSONException {
        this.resumed = true;
        this.mainHandler.post(new a(this, 0));
        AdView adView = this.bannerAdView;
        if (adView != null) {
            adView.resume();
        }
        if (this.bannerWanted && this.bannerAdView != null) {
            attachVisibleBanner();
        }
        scheduleAutoShowInterstitial();
    }

    public final void resetConsent() {
        this.mainHandler.post(new androidx.camera.core.y(5, this));
    }

    public final void setBannerPosition(String str) {
        kotlin.jvm.internal.j.e("position", str);
        runOnUiThread(new b(this, str));
    }

    public final void showBanner() {
        if (isEnabled()) {
            runOnUiThread(new g(this, 0));
        } else {
            emitAdError("adFailedToLoad", "AdMob is disabled in Project Settings (Step 8: Ads). Please enable AdMob to display ads.", "banner");
        }
    }

    public final void showInterstitial() {
        if (isEnabled()) {
            runOnUiThread(new t(2, this));
        } else {
            emitAdError("adFailedToShow", "AdMob is disabled in Project Settings (Step 8: Ads). Please enable AdMob to display ads.", "interstitial");
        }
    }

    public final void showPrivacyOptions() {
        this.mainHandler.post(new e(0, this));
    }

    public final void showRewarded(String str) {
        runOnUiThread(new q(3, this, str));
    }

    public final void updateBannerMargins() {
        runOnUiThread(new h(0, this));
    }
}
