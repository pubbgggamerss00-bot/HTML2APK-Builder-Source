package l9;

import com.basitce.htmltoapk.data.apkgenerator.AdMobTestIds;
import com.basitce.htmltoapk.domain.model.Project;
import i0.u2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final mh.k f16766a = new mh.k("^ca-app-pub-\\d{16}~\\d{10}$");

    /* renamed from: b, reason: collision with root package name */
    public static final mh.k f16767b = new mh.k("^ca-app-pub-\\d{16}/\\d{10}$");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l9.a$a, reason: collision with other inner class name */
    public static final class EnumC0168a {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0168a f16768a;

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0168a f16769b;

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0168a f16770c;

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0168a f16771d;

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0168a f16772e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumC0168a[] f16773f;

        static {
            EnumC0168a enumC0168a = new EnumC0168a("NONE", 0);
            f16768a = enumC0168a;
            EnumC0168a enumC0168a2 = new EnumC0168a("EMPTY", 1);
            f16769b = enumC0168a2;
            EnumC0168a enumC0168a3 = new EnumC0168a("CONTAINS_SLASH_INSTEAD_OF_TILDE", 2);
            f16770c = enumC0168a3;
            EnumC0168a enumC0168a4 = new EnumC0168a("MISSING_PREFIX", 3);
            f16771d = enumC0168a4;
            EnumC0168a enumC0168a5 = new EnumC0168a("INVALID_FORMAT", 4);
            f16772e = enumC0168a5;
            EnumC0168a[] enumC0168aArr = {enumC0168a, enumC0168a2, enumC0168a3, enumC0168a4, enumC0168a5};
            f16773f = enumC0168aArr;
            u2.e(enumC0168aArr);
        }

        public EnumC0168a() {
            throw null;
        }

        public static EnumC0168a valueOf(String str) {
            return (EnumC0168a) Enum.valueOf(EnumC0168a.class, str);
        }

        public static EnumC0168a[] values() {
            return (EnumC0168a[]) f16773f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16774a;

        /* renamed from: b, reason: collision with root package name */
        public static final b f16775b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f16776c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f16777d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f16778e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f16779f;

        static {
            b bVar = new b("NONE", 0);
            f16774a = bVar;
            b bVar2 = new b("EMPTY", 1);
            f16775b = bVar2;
            b bVar3 = new b("CONTAINS_TILDE_INSTEAD_OF_SLASH", 2);
            f16776c = bVar3;
            b bVar4 = new b("MISSING_PREFIX", 3);
            f16777d = bVar4;
            b bVar5 = new b("INVALID_FORMAT", 4);
            f16778e = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            f16779f = bVarArr;
            u2.e(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f16779f.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Project project) {
        String admobAppId;
        kotlin.jvm.internal.r.e(project, "project");
        if (project.getAdmobEnabled() && (!project.getAdmobUseTestAds() || ((admobAppId = project.getAdmobAppId()) != null && !mh.x.A(admobAppId)))) {
            int iOrdinal = f(project.getAdmobAppId()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return "AdMob is enabled but no App ID is set. Enter your App ID (ca-app-pub-...~...) or switch on test ads.";
                }
                if (iOrdinal == 2) {
                    return "AdMob App ID uses '/' instead of '~'. Expected: ca-app-pub-XXXXXXXXXXXXXXXX~YYYYYYYYYY";
                }
                if (iOrdinal == 3) {
                    String admobAppId2 = project.getAdmobAppId();
                    return m3.a.a("AdMob App ID must start with 'ca-app-pub-'. Current value: ", admobAppId2 != null ? mh.x.W(admobAppId2).toString() : null);
                }
                if (iOrdinal != 4) {
                    throw new pg.l();
                }
                String admobAppId3 = project.getAdmobAppId();
                return i8.n.d("Invalid AdMob App ID: ", admobAppId3 != null ? mh.x.W(admobAppId3).toString() : null, " (expected ca-app-pub-XXXXXXXXXXXXXXXX~YYYYYYYYYY)");
            }
            if (!project.getAdmobUseTestAds()) {
                String admobAppId4 = project.getAdmobAppId();
                if (kotlin.jvm.internal.r.a(admobAppId4 != null ? mh.x.W(admobAppId4).toString() : null, AdMobTestIds.APP_ID)) {
                    return "Google's sample AdMob App ID requires test ads. Enter your publisher App ID for live ads.";
                }
                for (pg.t tVar : qg.p.j(new pg.t("banner", project.getAdmobBannerUnitId(), Boolean.valueOf(project.getAdmobBannerEnabled())), new pg.t("interstitial", project.getAdmobInterstitialUnitId(), Boolean.valueOf(project.getAdmobInterstitialEnabled())), new pg.t("rewarded", project.getAdmobRewardedUnitId(), Boolean.valueOf(project.getAdmobRewardedEnabled())))) {
                    String str = (String) tVar.f21479a;
                    String str2 = (String) tVar.f21480b;
                    boolean zBooleanValue = ((Boolean) tVar.f21481c).booleanValue();
                    int iOrdinal2 = g(str2).ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                return p5.g0.a("Invalid AdMob ", str, " unit ID: ", str2 != null ? mh.x.W(str2).toString() : null, " (expected ca-app-pub-XXXXXXXXXXXXXXXX/YYYYYYYYYY)");
                            }
                            return i8.n.d("AdMob ", str, " unit ID uses '~' instead of '/'. Expected: ca-app-pub-XXXXXXXXXXXXXXXX/YYYYYYYYYY");
                        }
                        if (zBooleanValue) {
                            return i8.n.d("AdMob ", str, " is enabled but no unit ID is set. Enter your unit ID or switch on test ads.");
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String b(Project project) {
        kotlin.jvm.internal.r.e(project, "project");
        return c(project.getAdmobAppId(), project.getAdmobEnabled(), project.getAdmobUseTestAds());
    }

    public static String c(String str, boolean z10, boolean z11) {
        if (!z10) {
            return null;
        }
        String string = str != null ? mh.x.W(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (z11 && string.length() == 0) {
            return AdMobTestIds.APP_ID;
        }
        if (string.length() <= 0) {
            throw new IllegalArgumentException("AdMob is enabled but no App ID is set. Enter your App ID or switch on test ads.");
        }
        if (!d(string)) {
            throw new IllegalArgumentException("Enter a valid AdMob App ID (ca-app-pub-XXXXXXXXXXXXXXXX~YYYYYYYYYY).");
        }
        if (z11 || !string.equals(AdMobTestIds.APP_ID)) {
            return string;
        }
        throw new IllegalArgumentException("Google's sample AdMob App ID requires test ads. Enter your publisher App ID for live ads.");
    }

    public static boolean d(String str) {
        String string = str != null ? mh.x.W(str).toString() : null;
        if (string == null) {
            string = "";
        }
        return f16766a.e(string);
    }

    public static boolean e(String str) {
        String string = mh.x.W(str).toString();
        if (string == null) {
            string = "";
        }
        return f16767b.e(string);
    }

    public static EnumC0168a f(String str) {
        String string = str != null ? mh.x.W(str).toString() : null;
        if (string == null) {
            string = "";
        }
        return string.length() == 0 ? EnumC0168a.f16769b : (!mh.x.r(string, "/", false) || mh.x.r(string, "~", false)) ? !mh.t.p(string, "ca-app-pub-", false) ? EnumC0168a.f16771d : !f16766a.e(string) ? EnumC0168a.f16772e : EnumC0168a.f16768a : EnumC0168a.f16770c;
    }

    public static b g(String str) {
        String string = str != null ? mh.x.W(str).toString() : null;
        if (string == null) {
            string = "";
        }
        return string.length() == 0 ? b.f16775b : (!mh.x.r(string, "~", false) || mh.x.r(string, "/", false)) ? !mh.t.p(string, "ca-app-pub-", false) ? b.f16777d : !f16767b.e(string) ? b.f16778e : b.f16774a : b.f16776c;
    }
}
