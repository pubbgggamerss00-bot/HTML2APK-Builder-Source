package h8;

import android.content.SharedPreferences;
import c0.g0;
import c0.u0;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.WebViewSettings;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.p;
import ph.z0;
import qg.b0;
import qg.j0;
import qg.n0;
import qg.x;
import qg.z;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f12416a;

    /* renamed from: b, reason: collision with root package name */
    public final n8.s f12417b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.i f12418c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f12419d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.serialization.json.p f12420e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12421a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f12422b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f12423c;

        public a(ArrayList arrayList, LinkedHashMap linkedHashMap, List dropped) {
            kotlin.jvm.internal.r.e(dropped, "dropped");
            this.f12421a = arrayList;
            this.f12422b = linkedHashMap;
            this.f12423c = dropped;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12421a.equals(aVar.f12421a) && this.f12422b.equals(aVar.f12422b) && kotlin.jvm.internal.r.a(this.f12423c, aVar.f12423c);
        }

        public final int hashCode() {
            return this.f12423c.hashCode() + ((this.f12422b.hashCode() + (this.f12421a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Applied(changes=" + this.f12421a + ", autoPermissions=" + this.f12422b + ", dropped=" + this.f12423c + ")";
        }
    }

    public m(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, n8.s projects, n8.i folders) {
        kotlin.jvm.internal.r.e(projects, "projects");
        kotlin.jvm.internal.r.e(folders, "folders");
        this.f12416a = hilt_HtmlToApkApplication;
        this.f12417b = projects;
        this.f12418c = folders;
        this.f12419d = hilt_HtmlToApkApplication.getSharedPreferences("ai_projects", 0);
        this.f12420e = kotlinx.serialization.json.q.a(new l(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pg.n a(m mVar, ProjectEntity projectEntity, u uVar, String source) {
        ProjectEntity projectEntityCopy$default;
        ArrayList arrayList = new ArrayList();
        WebViewSettings webViewSettingsE = e(projectEntity.getWebViewSettingsJson());
        String str = uVar.f12463a;
        if (str == null) {
            projectEntityCopy$default = projectEntity;
        } else {
            String str2 = !str.equals(projectEntity.getAppName()) ? str : null;
            if (str2 != null) {
                ProjectEntity projectEntityCopy$default2 = ProjectEntity.copy$default(projectEntity, 0L, str2, str2, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -7, -1, 15, null);
                arrayList.add("appName");
                f0 f0Var = f0.f21461a;
                projectEntityCopy$default = projectEntityCopy$default2;
            }
        }
        String str3 = uVar.f12464b;
        if (str3 != null) {
            if (str3.equals("sensor")) {
                str3 = "auto";
            }
            String str4 = !str3.equals(projectEntityCopy$default.getOrientation()) ? str3 : null;
            if (str4 != null) {
                projectEntityCopy$default = ProjectEntity.copy$default(projectEntityCopy$default, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, str4, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -65537, -1, 15, null);
                arrayList.add("orientation");
                f0 f0Var2 = f0.f21461a;
            }
        }
        ProjectEntity projectEntityCopy$default3 = projectEntityCopy$default;
        Boolean bool = uVar.f12465c;
        if (bool != null) {
            if (bool.booleanValue() != projectEntityCopy$default3.getShowHeader()) {
                bool = null;
            }
            if (bool != null) {
                projectEntityCopy$default3 = ProjectEntity.copy$default(projectEntityCopy$default3, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, !bool.booleanValue(), false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -131073, -1, 15, null);
                arrayList.add("fullscreen");
                f0 f0Var3 = f0.f21461a;
            }
        }
        ProjectEntity projectEntityCopy$default4 = projectEntityCopy$default3;
        String str5 = uVar.f12466d;
        if (str5 != null) {
            String str6 = !str5.equalsIgnoreCase(projectEntityCopy$default4.getPrimaryColor()) ? str5 : null;
            if (str6 != null) {
                projectEntityCopy$default4 = ProjectEntity.copy$default(projectEntityCopy$default4, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, str6, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -32769, -1, 15, null);
                arrayList.add("statusBarColor");
                f0 f0Var4 = f0.f21461a;
            }
        }
        ProjectEntity projectEntity2 = projectEntityCopy$default4;
        Boolean bool2 = uVar.f12467e;
        if (bool2 != null) {
            if (bool2.booleanValue() == webViewSettingsE.getPullToRefresh()) {
                bool2 = null;
            }
            if (bool2 != null) {
                webViewSettingsE = webViewSettingsE.copy(((-131073) & 1) != 0 ? webViewSettingsE.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettingsE.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettingsE.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettingsE.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettingsE.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettingsE.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettingsE.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettingsE.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettingsE.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettingsE.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettingsE.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettingsE.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettingsE.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettingsE.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettingsE.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettingsE.pullToRefresh : bool2.booleanValue(), ((-131073) & 65536) != 0 ? webViewSettingsE.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettingsE.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettingsE.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettingsE.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettingsE.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettingsE.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettingsE.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettingsE.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettingsE.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettingsE.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettingsE.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettingsE.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettingsE.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettingsE.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettingsE.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettingsE.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettingsE.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettingsE.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettingsE.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettingsE.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettingsE.colorMode : null, (4194303 & 32) != 0 ? webViewSettingsE.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettingsE.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettingsE.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettingsE.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettingsE.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettingsE.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettingsE.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettingsE.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettingsE.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettingsE.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettingsE.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettingsE.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettingsE.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettingsE.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettingsE.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettingsE.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettingsE.pdfStartPage : 0);
                arrayList.add("pullToRefresh");
                f0 f0Var5 = f0.f21461a;
            }
        }
        WebViewSettings webViewSettingsCopy = webViewSettingsE;
        Boolean bool3 = uVar.f12468f;
        if (bool3 != null) {
            Boolean bool4 = bool3.booleanValue() != webViewSettingsCopy.getBackHistoryNavigation() ? bool3 : null;
            if (bool4 != null) {
                webViewSettingsCopy = webViewSettingsCopy.copy(((-131073) & 1) != 0 ? webViewSettingsCopy.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettingsCopy.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettingsCopy.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettingsCopy.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettingsCopy.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettingsCopy.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettingsCopy.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettingsCopy.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettingsCopy.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettingsCopy.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettingsCopy.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettingsCopy.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettingsCopy.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettingsCopy.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettingsCopy.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettingsCopy.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettingsCopy.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettingsCopy.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettingsCopy.backHistoryNavigation : bool4.booleanValue(), ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettingsCopy.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettingsCopy.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettingsCopy.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettingsCopy.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettingsCopy.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettingsCopy.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettingsCopy.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettingsCopy.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettingsCopy.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettingsCopy.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettingsCopy.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettingsCopy.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettingsCopy.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettingsCopy.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettingsCopy.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettingsCopy.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettingsCopy.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettingsCopy.colorMode : null, (4194303 & 32) != 0 ? webViewSettingsCopy.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettingsCopy.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettingsCopy.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettingsCopy.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettingsCopy.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettingsCopy.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettingsCopy.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettingsCopy.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettingsCopy.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettingsCopy.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettingsCopy.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettingsCopy.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettingsCopy.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettingsCopy.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettingsCopy.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettingsCopy.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettingsCopy.pdfStartPage : 0);
                arrayList.add("backHistoryNavigation");
                f0 f0Var6 = f0.f21461a;
            }
        }
        WebViewSettings webViewSettings = webViewSettingsCopy;
        Set setG0 = x.g0(mVar.f(projectEntity2));
        List<String> list = uVar.f12469g;
        if (list != null) {
            qg.t.p(list, setG0);
            f0 f0Var7 = f0.f21461a;
        }
        Set<String> set = p8.c.f21342a;
        kotlin.jvm.internal.r.e(source, "source");
        LinkedHashMap linkedHashMap = p8.c.c(g0.c(source)).f21349a;
        Set setC = n0.c(linkedHashMap.keySet(), x.h0(setG0));
        int iA = j0.a(qg.p.h(setC, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
        for (Object obj : setC) {
            Collection collection = (Set) linkedHashMap.get((String) obj);
            if (collection == null) {
                collection = b0.f22711a;
            }
            linkedHashMap2.put(obj, collection);
        }
        qg.t.p(linkedHashMap2.keySet(), setG0);
        if (!setG0.equals(x.h0(mVar.f(projectEntity2)))) {
            arrayList.add("permissions");
        }
        List listT = x.T(setG0);
        ArrayList arrayList2 = new ArrayList(qg.p.h(listT, 10));
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList2.add(kotlinx.serialization.json.i.b((String) it.next()));
        }
        return new pg.n(ProjectEntity.copy$default(projectEntity2, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, new kotlinx.serialization.json.c(arrayList2).toString(), null, null, null, null, false, false, false, false, false, kotlinx.serialization.json.b.f16435d.c(WebViewSettings.Companion.serializer(), webViewSettings), null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -4198401, -1, 15, null), new a(arrayList, linkedHashMap2, uVar.f12472j));
    }

    public static final void b(m mVar, File file, String str) throws IOException {
        File file2 = new File(file.getParentFile(), i8.n.d(".", file.getName(), ".tmp"));
        ah.l.r(file2, str, mh.a.f18238b);
        Files.move(file2.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
    }

    public static WebViewSettings e(String str) {
        Object objA;
        try {
            objA = (WebViewSettings) kotlinx.serialization.json.b.f16435d.b(WebViewSettings.Companion.serializer(), str);
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        Object webViewSettings = new WebViewSettings(false, false, false, false, false, false, false, false, false, false, 0, 0, (String) null, 0, false, false, false, false, false, false, false, (Boolean) null, false, (String) null, false, (String) null, 0, 0, 0, 0, 0, 0, 0, (String) null, false, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, -1, 4194303, (kotlin.jvm.internal.j) null);
        if (objA instanceof p.a) {
            objA = webViewSettings;
        }
        return (WebViewSettings) objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j10, vg.c cVar) {
        o oVar;
        m mVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f12433d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f12433d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(this, cVar);
            }
        }
        Object byId = oVar.f12431b;
        ug.a aVar = ug.a.f29706a;
        int i11 = oVar.f12433d;
        if (i11 == 0) {
            pg.q.b(byId);
            oVar.f12430a = this;
            oVar.f12433d = 1;
            byId = this.f12417b.f18583a.getById(j10, oVar);
            if (byId == aVar) {
                return aVar;
            }
            mVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = oVar.f12430a;
            pg.q.b(byId);
        }
        ProjectEntity projectEntity = (ProjectEntity) byId;
        if (projectEntity == null) {
            return "{}";
        }
        String webViewSettingsJson = projectEntity.getWebViewSettingsJson();
        mVar.getClass();
        WebViewSettings webViewSettingsE = e(webViewSettingsJson);
        kotlinx.serialization.json.w wVar = new kotlinx.serialization.json.w();
        wVar.b("appName", kotlinx.serialization.json.i.b(projectEntity.getAppName()));
        wVar.b("orientation", kotlinx.serialization.json.i.b(kotlin.jvm.internal.r.a(projectEntity.getOrientation(), "auto") ? "sensor" : projectEntity.getOrientation()));
        u0.b(wVar, "fullscreen", Boolean.valueOf(!projectEntity.getShowHeader()));
        String primaryColor = projectEntity.getPrimaryColor();
        if (primaryColor == null) {
            primaryColor = "#2196F3";
        }
        wVar.b("statusBarColor", kotlinx.serialization.json.i.b(primaryColor));
        u0.b(wVar, "pullToRefresh", Boolean.valueOf(webViewSettingsE.getPullToRefresh()));
        u0.b(wVar, "backHistoryNavigation", Boolean.valueOf(webViewSettingsE.getBackHistoryNavigation()));
        List<String> listF = mVar.f(projectEntity);
        ArrayList arrayList = new ArrayList(qg.p.h(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.serialization.json.i.b(mh.x.I((String) it.next(), "android.permission.")));
        }
        wVar.b("permissions", new kotlinx.serialization.json.c(arrayList));
        return wVar.a().toString();
    }

    public final File d(long j10) {
        return new File(this.f12416a.getFilesDir(), c2.u.a("projects/", "/content/index.html", j10));
    }

    public final List<String> f(ProjectEntity projectEntity) {
        Object objA;
        try {
            kotlinx.serialization.json.p pVar = this.f12420e;
            String permissionsJson = projectEntity.getPermissionsJson();
            pVar.getClass();
            objA = (List) pVar.b(new ArrayListSerializer(StringSerializer.INSTANCE), permissionsJson);
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        if (objA instanceof p.a) {
            objA = z.f22752a;
        }
        return (List) objA;
    }

    public final Long g(String sessionId) {
        Object next;
        String str;
        kotlin.jvm.internal.r.e(sessionId, "sessionId");
        Iterator<T> it = this.f12419d.getAll().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.r.a(((Map.Entry) next).getValue(), sessionId)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (str = (String) entry.getKey()) == null) {
            return null;
        }
        return mh.s.h(str);
    }

    public final Object h(long j10, vg.c cVar) {
        wh.c cVar2 = z0.f21632a;
        return ph.h.e(wh.b.f31563c, new p(this, j10, null), cVar);
    }
}
