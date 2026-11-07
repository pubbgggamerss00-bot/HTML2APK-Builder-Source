package y3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f33792a;

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f33793a;

        public a(ClipData clipData, int i10) {
            this.f33793a = j2.l0.a(clipData, i10);
        }

        @Override // y3.c.b
        public final void a(int i10) {
            this.f33793a.setFlags(i10);
        }

        @Override // y3.c.b
        public final c build() {
            return new c(new d(this.f33793a.build()));
        }
    }

    public interface b {
        void a(int i10);

        c build();
    }

    /* renamed from: y3.c$c, reason: collision with other inner class name */
    public static final class C0341c implements b {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f33794a;

        /* renamed from: b, reason: collision with root package name */
        public int f33795b;

        /* renamed from: c, reason: collision with root package name */
        public int f33796c;

        @Override // y3.c.b
        public final void a(int i10) {
            this.f33796c = i10;
        }

        @Override // y3.c.b
        public final c build() {
            return new c(new f(this));
        }
    }

    public static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f33797a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f33797a = j2.m0.a(contentInfo);
        }

        @Override // y3.c.e
        public final ContentInfo a() {
            return this.f33797a;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f33797a + "}";
        }
    }

    public interface e {
        ContentInfo a();
    }

    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f33798a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33799b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33800c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f33801d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f33802e;

        public f(C0341c c0341c) {
            ClipData clipData = c0341c.f33794a;
            clipData.getClass();
            this.f33798a = clipData;
            int i10 = c0341c.f33795b;
            if (i10 < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
            }
            if (i10 > 5) {
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
            }
            this.f33799b = i10;
            int i11 = c0341c.f33796c;
            if ((i11 & 1) == i11) {
                this.f33800c = i11;
                this.f33801d = null;
                this.f33802e = null;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // y3.c.e
        public final ContentInfo a() {
            return null;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f33798a.getDescription());
            sb.append(", source=");
            int i10 = this.f33799b;
            sb.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i11 = this.f33800c;
            sb.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
            Uri uri = this.f33801d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return b.o.a(sb, this.f33802e != null ? ", hasExtras" : "", "}");
        }
    }

    public c(e eVar) {
        this.f33792a = eVar;
    }

    public final String toString() {
        return this.f33792a.toString();
    }
}
