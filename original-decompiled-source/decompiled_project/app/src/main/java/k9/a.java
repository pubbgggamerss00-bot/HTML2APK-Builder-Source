package k9;

import com.basitce.htmltoapk.R;
import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0164a f16171c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f16172d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f16173e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ wg.b f16174f;

    /* renamed from: a, reason: collision with root package name */
    public final String f16175a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16176b;

    /* renamed from: k9.a$a, reason: collision with other inner class name */
    public static final class C0164a {
    }

    static {
        a aVar = new a(0, R.string.theme_system, "SYSTEM", "system");
        a[] aVarArr = {aVar, new a(1, R.string.theme_white, "WHITE", "white"), new a(2, R.string.theme_sky, "SKY", "sky"), new a(3, R.string.theme_rose, "ROSE", "rose"), new a(4, R.string.theme_mint, "MINT", "mint"), new a(5, R.string.theme_purple, "PURPLE", "purple"), new a(6, R.string.theme_black, "BLACK", "black"), new a(7, R.string.theme_amoled, "AMOLED", "amoled")};
        f16173e = aVarArr;
        f16174f = u2.e(aVarArr);
        f16171c = new C0164a();
        f16172d = aVar;
    }

    public a(int i10, int i11, String str, String str2) {
        this.f16175a = str2;
        this.f16176b = i11;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16173e.clone();
    }
}
