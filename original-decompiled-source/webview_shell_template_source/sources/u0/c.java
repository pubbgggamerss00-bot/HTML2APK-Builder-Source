package u0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.camera.camera2.internal.b1;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f14455a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f14456a;

        public a(ClipData clipData, int i6) {
            this.f14456a = b1.i(clipData, i6);
        }

        @Override // u0.c.b
        public final void a(Uri uri) {
            this.f14456a.setLinkUri(uri);
        }

        @Override // u0.c.b
        public final void b(int i6) {
            this.f14456a.setFlags(i6);
        }

        @Override // u0.c.b
        public final c build() {
            return new c(new d(this.f14456a.build()));
        }

        @Override // u0.c.b
        public final void setExtras(Bundle bundle) {
            this.f14456a.setExtras(bundle);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        void a(Uri uri);

        void b(int i6);

        c build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: u0.c$c, reason: collision with other inner class name */
    public static final class C0094c implements b {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f14457a;

        /* renamed from: b, reason: collision with root package name */
        public int f14458b;

        /* renamed from: c, reason: collision with root package name */
        public int f14459c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f14460d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f14461e;

        @Override // u0.c.b
        public final void a(Uri uri) {
            this.f14460d = uri;
        }

        @Override // u0.c.b
        public final void b(int i6) {
            this.f14459c = i6;
        }

        @Override // u0.c.b
        public final c build() {
            return new c(new f(this));
        }

        @Override // u0.c.b
        public final void setExtras(Bundle bundle) {
            this.f14461e = bundle;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f14462a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f14462a = b4.a.f(contentInfo);
        }

        @Override // u0.c.e
        public final ClipData a() {
            return this.f14462a.getClip();
        }

        @Override // u0.c.e
        public final int b() {
            return this.f14462a.getFlags();
        }

        @Override // u0.c.e
        public final ContentInfo c() {
            return this.f14462a;
        }

        @Override // u0.c.e
        public final int d() {
            return this.f14462a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f14462a + "}";
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f14463a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14464b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14465c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f14466d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f14467e;

        public f(C0094c c0094c) {
            ClipData clipData = c0094c.f14457a;
            clipData.getClass();
            this.f14463a = clipData;
            int i6 = c0094c.f14458b;
            androidx.work.j.c("source", i6, 0, 5);
            this.f14464b = i6;
            int i7 = c0094c.f14459c;
            if ((i7 & 1) == i7) {
                this.f14465c = i7;
                this.f14466d = c0094c.f14460d;
                this.f14467e = c0094c.f14461e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i7) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // u0.c.e
        public final ClipData a() {
            return this.f14463a;
        }

        @Override // u0.c.e
        public final int b() {
            return this.f14465c;
        }

        @Override // u0.c.e
        public final ContentInfo c() {
            return null;
        }

        @Override // u0.c.e
        public final int d() {
            return this.f14464b;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f14463a.getDescription());
            sb.append(", source=");
            int i6 = this.f14464b;
            sb.append(i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? String.valueOf(i6) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i7 = this.f14465c;
            sb.append((i7 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i7));
            String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            Uri uri = this.f14466d;
            if (uri == null) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            if (this.f14467e != null) {
                str2 = ", hasExtras";
            }
            return androidx.activity.m.e(sb, str2, "}");
        }
    }

    public c(e eVar) {
        this.f14455a = eVar;
    }

    public final String toString() {
        return this.f14455a.toString();
    }
}
