package m5;

import com.google.android.gms.internal.ads.yy1;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements w5.d<File> {

    /* renamed from: a, reason: collision with root package name */
    public final File f13887a;

    /* renamed from: b, reason: collision with root package name */
    public final e f13888b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a extends c {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class b extends e5.b<File> {

        /* renamed from: u, reason: collision with root package name */
        public final ArrayDeque<c> f13889u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f13891b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f13892c;

            /* renamed from: d, reason: collision with root package name */
            public int f13893d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f13894e;

            @Override // m5.d.c
            public final File a() {
                boolean z6 = this.f13894e;
                File file = this.f13899a;
                if (!z6 && this.f13892c == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f13892c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        this.f13894e = true;
                    }
                }
                File[] fileArr = this.f13892c;
                if (fileArr == null || this.f13893d >= fileArr.length) {
                    if (this.f13891b) {
                        return null;
                    }
                    this.f13891b = true;
                    return file;
                }
                j.b(fileArr);
                int i6 = this.f13893d;
                this.f13893d = i6 + 1;
                return fileArr[i6];
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: m5.d$b$b, reason: collision with other inner class name */
        public final class C0079b extends c {

            /* renamed from: b, reason: collision with root package name */
            public boolean f13895b;

            @Override // m5.d.c
            public final File a() {
                if (this.f13895b) {
                    return null;
                }
                this.f13895b = true;
                return this.f13899a;
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f13896b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f13897c;

            /* renamed from: d, reason: collision with root package name */
            public int f13898d;

            @Override // m5.d.c
            public final File a() {
                boolean z6 = this.f13896b;
                File file = this.f13899a;
                if (!z6) {
                    this.f13896b = true;
                    return file;
                }
                File[] fileArr = this.f13897c;
                if (fileArr != null && this.f13898d >= fileArr.length) {
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f13897c = fileArrListFiles;
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        return null;
                    }
                }
                File[] fileArr2 = this.f13897c;
                j.b(fileArr2);
                int i6 = this.f13898d;
                this.f13898d = i6 + 1;
                return fileArr2[i6];
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f13889u = arrayDeque;
            File file = d.this.f13887a;
            if (file.isDirectory()) {
                arrayDeque.push(b(file));
            } else if (!file.isFile()) {
                this.s = 2;
            } else {
                j.e("rootFile", file);
                arrayDeque.push(new C0079b(file));
            }
        }

        public final a b(File file) {
            int iOrdinal = d.this.f13888b.ordinal();
            if (iOrdinal == 0) {
                j.e("rootDir", file);
                return new c(file);
            }
            if (iOrdinal != 1) {
                throw new yy1();
            }
            j.e("rootDir", file);
            return new a(file);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final File f13899a;

        public c(File file) {
            j.e("root", file);
            this.f13899a = file;
        }

        public abstract File a();
    }

    public d(File file, e eVar) {
        this.f13887a = file;
        this.f13888b = eVar;
    }

    @Override // w5.d
    public final Iterator<File> iterator() {
        return new b();
    }
}
