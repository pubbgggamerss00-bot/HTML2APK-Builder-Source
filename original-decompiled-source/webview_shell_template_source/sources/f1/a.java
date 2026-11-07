package f1;

import android.widget.EditText;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0057a f12960a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: f1.a$a, reason: collision with other inner class name */
    public static class C0057a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f12961a;

        /* renamed from: b, reason: collision with root package name */
        public final g f12962b;

        public C0057a(EditText editText) {
            this.f12961a = editText;
            g gVar = new g(editText);
            this.f12962b = gVar;
            editText.addTextChangedListener(gVar);
            if (f1.b.f12964b == null) {
                synchronized (f1.b.f12963a) {
                    try {
                        if (f1.b.f12964b == null) {
                            f1.b bVar = new f1.b();
                            try {
                                f1.b.f12965c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, f1.b.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            f1.b.f12964b = bVar;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(f1.b.f12964b);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
    }

    public a(EditText editText) {
        this.f12960a = new C0057a(editText);
    }
}
