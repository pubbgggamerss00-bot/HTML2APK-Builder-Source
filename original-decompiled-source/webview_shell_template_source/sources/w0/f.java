package w0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f14857a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f14857a = new a(uri, clipDescription, uri2);
        } else {
            this.f14857a = new b(uri, clipDescription, uri2);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f14858a;

        public a(Object obj) {
            this.f14858a = (InputContentInfo) obj;
        }

        @Override // w0.f.c
        public final Uri a() {
            return this.f14858a.getContentUri();
        }

        @Override // w0.f.c
        public final void b() {
            this.f14858a.requestPermission();
        }

        @Override // w0.f.c
        public final Uri c() {
            return this.f14858a.getLinkUri();
        }

        @Override // w0.f.c
        public final Object d() {
            return this.f14858a;
        }

        @Override // w0.f.c
        public final ClipDescription getDescription() {
            return this.f14858a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f14858a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public f(a aVar) {
        this.f14857a = aVar;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f14859a;

        /* renamed from: b, reason: collision with root package name */
        public final ClipDescription f14860b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f14861c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f14859a = uri;
            this.f14860b = clipDescription;
            this.f14861c = uri2;
        }

        @Override // w0.f.c
        public final Uri a() {
            return this.f14859a;
        }

        @Override // w0.f.c
        public final Uri c() {
            return this.f14861c;
        }

        @Override // w0.f.c
        public final Object d() {
            return null;
        }

        @Override // w0.f.c
        public final ClipDescription getDescription() {
            return this.f14860b;
        }

        @Override // w0.f.c
        public final void b() {
        }
    }
}
