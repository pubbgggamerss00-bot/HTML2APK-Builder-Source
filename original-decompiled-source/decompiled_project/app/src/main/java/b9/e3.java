package b9;

import android.net.Uri;
import java.io.File;

/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static a f3796a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f3797a;

        /* renamed from: b, reason: collision with root package name */
        public final b f3798b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3799c;

        /* renamed from: d, reason: collision with root package name */
        public final String f3800d;

        /* renamed from: e, reason: collision with root package name */
        public final Uri f3801e;

        /* renamed from: f, reason: collision with root package name */
        public final File f3802f;

        /* renamed from: g, reason: collision with root package name */
        public final String f3803g;

        /* renamed from: h, reason: collision with root package name */
        public final String f3804h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f3805i;

        /* renamed from: j, reason: collision with root package name */
        public final String f3806j;

        /* renamed from: k, reason: collision with root package name */
        public final String f3807k;

        /* renamed from: l, reason: collision with root package name */
        public final int f3808l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f3809m;

        /* renamed from: n, reason: collision with root package name */
        public final Long f3810n;

        public a() {
            this(null, null, null, null, null, null, null, null, null, 0, false, null, 16383);
        }

        public static a a(a aVar, Uri uri) {
            b bVar = b.f3813c;
            String title = aVar.f3797a;
            String url = aVar.f3800d;
            File file = aVar.f3802f;
            String str = aVar.f3803g;
            String str2 = aVar.f3804h;
            boolean z10 = aVar.f3805i;
            String colorMode = aVar.f3807k;
            int i10 = aVar.f3808l;
            boolean z11 = aVar.f3809m;
            Long l10 = aVar.f3810n;
            aVar.getClass();
            kotlin.jvm.internal.r.e(title, "title");
            kotlin.jvm.internal.r.e(url, "url");
            kotlin.jvm.internal.r.e(colorMode, "colorMode");
            return new a(title, bVar, "", url, uri, file, str, str2, z10, "UTF-8", colorMode, i10, z11, l10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f3797a, aVar.f3797a) && this.f3798b == aVar.f3798b && kotlin.jvm.internal.r.a(this.f3799c, aVar.f3799c) && kotlin.jvm.internal.r.a(this.f3800d, aVar.f3800d) && kotlin.jvm.internal.r.a(this.f3801e, aVar.f3801e) && kotlin.jvm.internal.r.a(this.f3802f, aVar.f3802f) && kotlin.jvm.internal.r.a(this.f3803g, aVar.f3803g) && kotlin.jvm.internal.r.a(this.f3804h, aVar.f3804h) && this.f3805i == aVar.f3805i && kotlin.jvm.internal.r.a(this.f3806j, aVar.f3806j) && kotlin.jvm.internal.r.a(this.f3807k, aVar.f3807k) && this.f3808l == aVar.f3808l && this.f3809m == aVar.f3809m && kotlin.jvm.internal.r.a(this.f3810n, aVar.f3810n);
        }

        public final int hashCode() {
            int iA = l0.k.a(l0.k.a((this.f3798b.hashCode() + (this.f3797a.hashCode() * 31)) * 31, 31, this.f3799c), 31, this.f3800d);
            Uri uri = this.f3801e;
            int iHashCode = (iA + (uri == null ? 0 : uri.hashCode())) * 31;
            File file = this.f3802f;
            int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
            String str = this.f3803g;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f3804h;
            int iA2 = r.o2.a((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f3805i);
            String str3 = this.f3806j;
            int iA3 = r.o2.a(androidx.datastore.preferences.protobuf.a1.a(this.f3808l, l0.k.a((iA2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f3807k), 31), 31, this.f3809m);
            Long l10 = this.f3810n;
            return iA3 + (l10 != null ? l10.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreviewData(title=");
            sb.append(this.f3797a);
            sb.append(", type=");
            sb.append(this.f3798b);
            sb.append(", htmlContent=");
            androidx.room.z0.a(sb, this.f3799c, ", url=", this.f3800d, ", fileUri=");
            sb.append(this.f3801e);
            sb.append(", folderDir=");
            sb.append(this.f3802f);
            sb.append(", assetPath=");
            androidx.room.z0.a(sb, this.f3803g, ", storageId=", this.f3804h, ", standalone=");
            sb.append(this.f3805i);
            sb.append(", textEncoding=");
            sb.append(this.f3806j);
            sb.append(", colorMode=");
            sb.append(this.f3807k);
            sb.append(", mixedContentMode=");
            sb.append(this.f3808l);
            sb.append(", showBridgeNote=");
            sb.append(this.f3809m);
            sb.append(", editProjectId=");
            sb.append(this.f3810n);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, b bVar, String str2, String str3, Uri uri, File file, String str4, String str5, String str6, int i10, boolean z10, Long l10, int i11) {
            int i12;
            String str7 = (i11 & 1) != 0 ? "" : str;
            b bVar2 = (i11 & 2) != 0 ? b.f3811a : bVar;
            String str8 = (i11 & 4) != 0 ? "" : str2;
            String str9 = (i11 & 8) != 0 ? "" : str3;
            Uri uri2 = (i11 & 16) != 0 ? null : uri;
            File file2 = (i11 & 32) != 0 ? null : file;
            String str10 = (i11 & 64) != 0 ? null : str4;
            String str11 = (i11 & 128) != 0 ? null : str5;
            boolean z11 = false;
            if ((i11 & 256) != 0) {
                i12 = 0;
            } else {
                i12 = 0;
                z11 = true;
            }
            this(str7, bVar2, str8, str9, uri2, file2, str10, str11, z11, (i11 & 512) != 0 ? null : "UTF-8", (i11 & 1024) != 0 ? "auto" : str6, (i11 & 2048) != 0 ? i12 : i10, (i11 & 4096) != 0 ? true : z10, (i11 & 8192) != 0 ? null : l10);
        }

        public a(String title, b type, String htmlContent, String url, Uri uri, File file, String str, String str2, boolean z10, String str3, String colorMode, int i10, boolean z11, Long l10) {
            kotlin.jvm.internal.r.e(title, "title");
            kotlin.jvm.internal.r.e(type, "type");
            kotlin.jvm.internal.r.e(htmlContent, "htmlContent");
            kotlin.jvm.internal.r.e(url, "url");
            kotlin.jvm.internal.r.e(colorMode, "colorMode");
            this.f3797a = title;
            this.f3798b = type;
            this.f3799c = htmlContent;
            this.f3800d = url;
            this.f3801e = uri;
            this.f3802f = file;
            this.f3803g = str;
            this.f3804h = str2;
            this.f3805i = z10;
            this.f3806j = str3;
            this.f3807k = colorMode;
            this.f3808l = i10;
            this.f3809m = z11;
            this.f3810n = l10;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3811a;

        /* renamed from: b, reason: collision with root package name */
        public static final b f3812b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f3813c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f3814d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f3815e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f3816f;

        static {
            b bVar = new b("PASTE", 0);
            f3811a = bVar;
            b bVar2 = new b("URL", 1);
            f3812b = bVar2;
            b bVar3 = new b("LOCAL", 2);
            f3813c = bVar3;
            b bVar4 = new b("FOLDER", 3);
            f3814d = bVar4;
            b bVar5 = new b("ASSET", 4);
            f3815e = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            f3816f = bVarArr;
            i0.u2.e(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f3816f.clone();
        }
    }
}
