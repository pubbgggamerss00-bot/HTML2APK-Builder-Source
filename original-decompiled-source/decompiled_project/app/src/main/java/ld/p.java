package ld;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final md.a f17018b = new md.a(p.class.getSimpleName());

    /* renamed from: a, reason: collision with root package name */
    public sd.q<SharedPreferences> f17019a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a[] f17020a = {new a("DEFAULT_APP_CHECK_TOKEN", 0), new a("UNKNOWN_APP_CHECK_TOKEN", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f17020a.clone();
        }
    }
}
