package l9;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.datastore.preferences.protobuf.a1;
import f9.ng;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.e2;
import ph.v1;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f16796b = {"document_id", "_display_name", "mime_type", "_size"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f16797a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f16798a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16799b;

        public a(Uri uri, String relativePath) {
            kotlin.jvm.internal.r.e(relativePath, "relativePath");
            this.f16798a = uri;
            this.f16799b = relativePath;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16800a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16801b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16802c;

        public b(int i10, int i11, int i12) {
            this.f16800a = i10;
            this.f16801b = i11;
            this.f16802c = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16800a == bVar.f16800a && this.f16801b == bVar.f16801b && this.f16802c == bVar.f16802c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16802c) + a1.a(this.f16801b, Integer.hashCode(this.f16800a) * 31, 31);
        }

        public final String toString() {
            return x0.a.a(p.g0.a(this.f16800a, this.f16801b, "Progress(found=", ", copied=", ", total="), this.f16802c, ")");
        }
    }

    public interface c {

        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final String f16803a;

            public a(String path) {
                kotlin.jvm.internal.r.e(path, "path");
                this.f16803a = path;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.r.a(this.f16803a, ((a) obj).f16803a);
            }

            public final int hashCode() {
                return this.f16803a.hashCode();
            }

            public final String toString() {
                return i8.n.d("CopyFailed(path=", this.f16803a, ")");
            }
        }

        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f16804a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1446431115;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* renamed from: l9.f0$c$c, reason: collision with other inner class name */
        public static final class C0169c implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0169c f16805a = new C0169c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0169c);
            }

            public final int hashCode() {
                return -2146958194;
            }

            public final String toString() {
                return "NoHtml";
            }
        }

        public static final class d implements c {

            /* renamed from: a, reason: collision with root package name */
            public final long f16806a;

            public d(long j10) {
                this.f16806a = j10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f16806a == ((d) obj).f16806a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f16806a);
            }

            public final String toString() {
                return c2.u.a("NoSpace(requiredBytes=", ")", this.f16806a);
            }
        }

        public static final class e implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f16807a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1223358889;
            }

            public final String toString() {
                return "OpenFailed";
            }
        }

        public static final class f implements c {

            /* renamed from: a, reason: collision with root package name */
            public final int f16808a;

            /* renamed from: b, reason: collision with root package name */
            public final int f16809b;

            /* renamed from: c, reason: collision with root package name */
            public final String f16810c;

            public f(int i10, int i11, String str) {
                this.f16808a = i10;
                this.f16809b = i11;
                this.f16810c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f16808a == fVar.f16808a && this.f16809b == fVar.f16809b && kotlin.jvm.internal.r.a(this.f16810c, fVar.f16810c);
            }

            public final int hashCode() {
                int iA = a1.a(this.f16809b, Integer.hashCode(this.f16808a) * 31, 31);
                String str = this.f16810c;
                return iA + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return b.o.a(p.g0.a(this.f16808a, this.f16809b, "Success(fileCount=", ", skippedCount=", ", folderName="), this.f16810c, ")");
            }
        }

        public static final class g implements c {

            /* renamed from: a, reason: collision with root package name */
            public final int f16811a;

            /* renamed from: b, reason: collision with root package name */
            public final long f16812b;

            public g(int i10, long j10) {
                this.f16811a = i10;
                this.f16812b = j10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.f16811a == gVar.f16811a && this.f16812b == gVar.f16812b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f16812b) + (Integer.hashCode(this.f16811a) * 31);
            }

            public final String toString() {
                return "TooLarge(fileCount=" + this.f16811a + ", totalBytes=" + this.f16812b + ")";
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f16813a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16814b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16815c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f16816d;

        public d(ArrayList arrayList, int i10, long j10, boolean z10) {
            this.f16813a = arrayList;
            this.f16814b = i10;
            this.f16815c = j10;
            this.f16816d = z10;
        }
    }

    public f0(Context context) {
        kotlin.jvm.internal.r.e(context, "context");
        this.f16797a = context;
    }

    public final Boolean a(Uri uri, File file, g0 g0Var) throws IOException {
        InputStream inputStreamOpenInputStream;
        boolean z10 = false;
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            inputStreamOpenInputStream = this.f16797a.getContentResolver().openInputStream(uri);
        } catch (IOException | SecurityException unused) {
        }
        if (inputStreamOpenInputStream == null) {
            throw new IOException("null stream");
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[65536];
                loop0: while (true) {
                    long j10 = 0;
                    do {
                        int i10 = inputStreamOpenInputStream.read(bArr);
                        if (i10 < 0) {
                            break loop0;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                        j10 += i10;
                    } while (j10 < 4194304);
                    v1.e(g0Var.getContext());
                }
                pg.f0 f0Var = pg.f0.f21461a;
                fileOutputStream.close();
                inputStreamOpenInputStream.close();
                z10 = true;
                return Boolean.valueOf(z10);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025b A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:22:0x0089, B:95:0x0226, B:97:0x022e, B:102:0x025b), top: B:148:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027c A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #1 {all -> 0x0060, blocks: (B:15:0x005b, B:80:0x01a5, B:82:0x01ab, B:84:0x01b3, B:86:0x01d3, B:91:0x0200, B:104:0x0277, B:105:0x027b, B:106:0x027c), top: B:150:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109 A[Catch: IllegalArgumentException -> 0x0358, SecurityException -> 0x035b, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x0358, SecurityException -> 0x035b, blocks: (B:29:0x00ae, B:49:0x0105, B:51:0x0109, B:45:0x00f0), top: B:150:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ab A[Catch: all -> 0x0060, TryCatch #1 {all -> 0x0060, blocks: (B:15:0x005b, B:80:0x01a5, B:82:0x01ab, B:84:0x01b3, B:86:0x01d3, B:91:0x0200, B:104:0x0277, B:105:0x027b, B:106:0x027c), top: B:150:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022e A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:22:0x0089, B:95:0x0226, B:97:0x022e, B:102:0x025b), top: B:148:0x0089 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0223 -> B:95:0x0226). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uri uri, File file, ng ngVar, vg.c cVar) throws Throwable {
        g0 g0Var;
        e2 e2Var;
        i0 i0Var;
        File parentFile;
        Object objC;
        f0 f0Var;
        d dVar;
        File file2;
        eh.l lVar;
        String str;
        d dVar2;
        File file3;
        Iterator it;
        Uri uri2;
        int i10;
        File file4;
        f0 f0Var2;
        Uri uri3;
        d dVar3;
        a aVar;
        int i11;
        Object obj;
        e2 e2Var2;
        i0 i0Var2;
        Uri uri4;
        f0 f0Var3;
        String str2;
        Cursor cursorQuery;
        Uri uri5 = uri;
        File contentDir = file;
        eh.l lVar2 = ngVar;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i12 = g0Var.f16834p;
            if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                g0Var.f16834p = i12 - PKIFailureInfo.systemUnavail;
            } else {
                g0Var = new g0(this, cVar);
            }
        }
        Object obj2 = g0Var.f16832m;
        Object obj3 = ug.a.f29706a;
        boolean z10 = true;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            switch (g0Var.f16834p) {
                case 0:
                    pg.q.b(obj2);
                    kotlin.jvm.internal.r.e(contentDir, "contentDir");
                    File parentFile2 = contentDir.getParentFile();
                    if (parentFile2 != null) {
                        File file5 = new File(parentFile2, "content.previous");
                        if (file5.exists()) {
                            if (contentDir.exists()) {
                                ah.l.f(file5);
                            } else {
                                file5.renameTo(contentDir);
                            }
                        }
                    }
                    parentFile = contentDir.getParentFile();
                    if (parentFile == null) {
                        return c.e.f16807a;
                    }
                    g0Var.f16821a = this;
                    g0Var.f16822b = uri5;
                    g0Var.f16823c = contentDir;
                    g0Var.f16824d = lVar2;
                    g0Var.f16825e = parentFile;
                    g0Var.f16834p = 1;
                    objC = c(uri5, lVar2, g0Var);
                    if (objC == obj3) {
                        return obj3;
                    }
                    f0Var = this;
                    dVar = (d) objC;
                    if (dVar != null) {
                        return c.e.f16807a;
                    }
                    long j10 = dVar.f16815c;
                    ArrayList arrayList = dVar.f16813a;
                    if (dVar.f16816d || j10 > 524288000) {
                        return new c.g(arrayList.size(), j10);
                    }
                    if (arrayList.isEmpty()) {
                        return c.b.f16804a;
                    }
                    Set<String> set = o0.f16861a;
                    ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj4 = arrayList.get(i13);
                        i13++;
                        arrayList2.add(((a) obj4).f16799b);
                        z10 = z10;
                    }
                    if (o0.a(arrayList2) == null) {
                        return c.C0169c.f16805a;
                    }
                    parentFile.mkdirs();
                    long j11 = j10 + 20971520;
                    long usableSpace = parentFile.getUsableSpace();
                    if (1 <= usableSpace && usableSpace < j11) {
                        return new c.d(j11);
                    }
                    File file6 = new File(parentFile, "content.importing");
                    try {
                        ah.l.f(file6);
                    } catch (Throwable th3) {
                        th = th3;
                        contentDir = file6;
                        e2Var = e2.f21526b;
                        i0Var = new i0(contentDir, null);
                        g0Var.f16821a = th;
                        g0Var.f16822b = null;
                        g0Var.f16823c = null;
                        g0Var.f16824d = null;
                        g0Var.f16825e = null;
                        g0Var.f16826f = null;
                        g0Var.f16827g = null;
                        g0Var.f16828h = null;
                        g0Var.f16829j = null;
                        g0Var.f16834p = 7;
                        if (ph.h.e(e2Var, i0Var, g0Var) != obj3) {
                        }
                    }
                    if (!file6.mkdirs()) {
                        throw new IOException("Cannot create " + file6.getName());
                    }
                    file2 = contentDir;
                    lVar = lVar2;
                    str = file6.getCanonicalPath() + File.separator;
                    dVar2 = dVar;
                    file3 = file6;
                    it = arrayList.iterator();
                    uri2 = uri5;
                    i10 = 0;
                    if (!it.hasNext()) {
                        Object next = it.next();
                        int i14 = i10 + 1;
                        if (i10 < 0) {
                            qg.p.o();
                            throw null;
                        }
                        aVar = (a) next;
                        v1.e(g0Var.getContext());
                        File file7 = new File(file3, aVar.f16799b);
                        String canonicalPath = file7.getCanonicalPath();
                        kotlin.jvm.internal.r.d(canonicalPath, "getCanonicalPath(...)");
                        if (mh.t.p(canonicalPath, str, false)) {
                            Uri uri6 = aVar.f16798a;
                            g0Var.f16821a = f0Var;
                            g0Var.f16822b = uri2;
                            g0Var.f16823c = file2;
                            g0Var.f16824d = lVar;
                            g0Var.f16825e = dVar2;
                            g0Var.f16826f = file3;
                            g0Var.f16827g = str;
                            g0Var.f16828h = it;
                            g0Var.f16829j = aVar;
                            g0Var.f16830k = i14;
                            g0Var.f16831l = i10;
                            g0Var.f16834p = 3;
                            Object objA = f0Var.a(uri6, file7, g0Var);
                            if (objA != obj3) {
                                file4 = file3;
                                i11 = i14;
                                obj = objA;
                                if (((Boolean) obj).booleanValue()) {
                                    c.a aVar2 = new c.a(aVar.f16799b);
                                    e2 e2Var3 = e2.f21526b;
                                    i0 i0Var3 = new i0(file4, null);
                                    g0Var.f16821a = aVar2;
                                    g0Var.f16822b = null;
                                    g0Var.f16823c = null;
                                    g0Var.f16824d = null;
                                    g0Var.f16825e = null;
                                    g0Var.f16826f = null;
                                    g0Var.f16827g = null;
                                    g0Var.f16828h = null;
                                    g0Var.f16829j = null;
                                    g0Var.f16834p = 4;
                                    if (ph.h.e(e2Var3, i0Var3, g0Var) != obj3) {
                                        return aVar2;
                                    }
                                } else {
                                    lVar.invoke(new b(dVar2.f16813a.size(), i10 + 1, dVar2.f16813a.size()));
                                    i10 = i11;
                                    file3 = file4;
                                    if (!it.hasNext()) {
                                        e2 e2Var4 = e2.f21526b;
                                        h0 h0Var = new h0(file3, file2, null);
                                        g0Var.f16821a = f0Var;
                                        g0Var.f16822b = uri2;
                                        g0Var.f16823c = dVar2;
                                        g0Var.f16824d = file3;
                                        g0Var.f16825e = null;
                                        g0Var.f16826f = null;
                                        g0Var.f16827g = null;
                                        g0Var.f16828h = null;
                                        g0Var.f16829j = null;
                                        g0Var.f16834p = 5;
                                        if (ph.h.e(e2Var4, h0Var, g0Var) != obj3) {
                                            f0Var2 = f0Var;
                                            uri3 = uri2;
                                            dVar3 = dVar2;
                                            e2Var2 = e2.f21526b;
                                            i0Var2 = new i0(file3, null);
                                            g0Var.f16821a = f0Var2;
                                            g0Var.f16822b = uri3;
                                            g0Var.f16823c = dVar3;
                                            g0Var.f16824d = null;
                                            g0Var.f16834p = 6;
                                            if (ph.h.e(e2Var2, i0Var2, g0Var) != obj3) {
                                                uri4 = uri3;
                                                f0Var3 = f0Var2;
                                                int size2 = dVar3.f16813a.size();
                                                int i15 = dVar3.f16814b;
                                                f0Var3.getClass();
                                                try {
                                                    cursorQuery = f0Var3.f16797a.getContentResolver().query(DocumentsContract.buildDocumentUriUsingTree(uri4, DocumentsContract.getTreeDocumentId(uri4)), new String[]{"_display_name"}, null, null, null);
                                                } catch (Exception unused) {
                                                }
                                                if (cursorQuery == null) {
                                                    try {
                                                        String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                                                        cursorQuery.close();
                                                        str2 = string;
                                                    } finally {
                                                    }
                                                } else {
                                                    str2 = null;
                                                }
                                                return new c.f(size2, i15, str2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c.a aVar3 = new c.a(aVar.f16799b);
                            e2 e2Var5 = e2.f21526b;
                            i0 i0Var4 = new i0(file3, null);
                            g0Var.f16821a = aVar3;
                            g0Var.f16822b = null;
                            g0Var.f16823c = null;
                            g0Var.f16824d = null;
                            g0Var.f16825e = null;
                            g0Var.f16826f = null;
                            g0Var.f16827g = null;
                            g0Var.f16828h = null;
                            g0Var.f16829j = null;
                            g0Var.f16834p = 2;
                            if (ph.h.e(e2Var5, i0Var4, g0Var) != obj3) {
                                return aVar3;
                            }
                        }
                    }
                    return obj3;
                case 1:
                    File file8 = (File) g0Var.f16825e;
                    eh.l lVar3 = (eh.l) g0Var.f16824d;
                    File file9 = (File) g0Var.f16823c;
                    Uri uri7 = g0Var.f16822b;
                    f0Var = (f0) g0Var.f16821a;
                    pg.q.b(obj2);
                    parentFile = file8;
                    uri5 = uri7;
                    objC = obj2;
                    lVar2 = lVar3;
                    contentDir = file9;
                    dVar = (d) objC;
                    if (dVar != null) {
                    }
                    break;
                case 2:
                    c.a aVar4 = (c.a) g0Var.f16821a;
                    pg.q.b(obj2);
                    return aVar4;
                case 3:
                    i10 = g0Var.f16831l;
                    i11 = g0Var.f16830k;
                    aVar = g0Var.f16829j;
                    it = g0Var.f16828h;
                    str = g0Var.f16827g;
                    file4 = g0Var.f16826f;
                    dVar2 = (d) g0Var.f16825e;
                    lVar = (eh.l) g0Var.f16824d;
                    file2 = (File) g0Var.f16823c;
                    uri2 = g0Var.f16822b;
                    f0Var = (f0) g0Var.f16821a;
                    try {
                        pg.q.b(obj2);
                        obj = obj2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        contentDir = file4;
                        e2Var = e2.f21526b;
                        i0Var = new i0(contentDir, null);
                        g0Var.f16821a = th;
                        g0Var.f16822b = null;
                        g0Var.f16823c = null;
                        g0Var.f16824d = null;
                        g0Var.f16825e = null;
                        g0Var.f16826f = null;
                        g0Var.f16827g = null;
                        g0Var.f16828h = null;
                        g0Var.f16829j = null;
                        g0Var.f16834p = 7;
                        if (ph.h.e(e2Var, i0Var, g0Var) != obj3) {
                            return obj3;
                        }
                        throw th;
                    }
                    break;
                case 4:
                    c.a aVar5 = (c.a) g0Var.f16821a;
                    pg.q.b(obj2);
                    return aVar5;
                case 5:
                    file3 = (File) g0Var.f16824d;
                    dVar3 = (d) g0Var.f16823c;
                    uri3 = g0Var.f16822b;
                    f0Var2 = (f0) g0Var.f16821a;
                    pg.q.b(obj2);
                    e2Var2 = e2.f21526b;
                    i0Var2 = new i0(file3, null);
                    g0Var.f16821a = f0Var2;
                    g0Var.f16822b = uri3;
                    g0Var.f16823c = dVar3;
                    g0Var.f16824d = null;
                    g0Var.f16834p = 6;
                    if (ph.h.e(e2Var2, i0Var2, g0Var) != obj3) {
                    }
                    return obj3;
                case 6:
                    dVar3 = (d) g0Var.f16823c;
                    uri4 = g0Var.f16822b;
                    f0Var3 = (f0) g0Var.f16821a;
                    pg.q.b(obj2);
                    int size22 = dVar3.f16813a.size();
                    int i152 = dVar3.f16814b;
                    f0Var3.getClass();
                    cursorQuery = f0Var3.f16797a.getContentResolver().query(DocumentsContract.buildDocumentUriUsingTree(uri4, DocumentsContract.getTreeDocumentId(uri4)), new String[]{"_display_name"}, null, null, null);
                    if (cursorQuery == null) {
                    }
                    return new c.f(size22, i152, str2);
                case 7:
                    Throwable th5 = (Throwable) g0Var.f16821a;
                    pg.q.b(obj2);
                    throw th5;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (IllegalArgumentException unused2) {
            return c.e.f16807a;
        } catch (SecurityException unused3) {
            return c.e.f16807a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        r2 = l9.o0.f16861a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if (mh.t.p(r8, ".", false) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (l9.o0.f16861a.contains(r8) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
    
        if (r5.length() != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        r8 = r5 + "/" + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        if (r9 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        r11.addLast(new pg.n(r6, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
    
        if (r15.isNull(3) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0120, code lost:
    
        r13 = r15.getLong(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
    
        r6 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r23, r6);
        kotlin.jvm.internal.r.d(r6, "buildDocumentUriUsingTree(...)");
        r3.add(new l9.f0.a(r6, r8));
        r8 = r17 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013d, code lost:
    
        if (r3.size() > 20000) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
    
        if (r8 <= 524288000) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0147, code lost:
    
        r17 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014c, code lost:
    
        r5 = new l9.f0.d(r3, r7, r8, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d c(Uri uri, eh.l lVar, g0 g0Var) throws IOException {
        ContentResolver contentResolver = this.f16797a.getContentResolver();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        qg.l lVar2 = new qg.l();
        lVar2.addLast(new pg.n(DocumentsContract.getTreeDocumentId(uri), ""));
        int i10 = 0;
        int i11 = 0;
        long j10 = 0;
        while (!lVar2.isEmpty()) {
            v1.e(g0Var.getContext());
            pg.n nVar = (pg.n) lVar2.removeFirst();
            String str = (String) nVar.f21469a;
            String str2 = (String) nVar.f21470b;
            if (hashSet.add(str)) {
                int i12 = 1;
                Cursor cursorQuery = contentResolver.query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, str), f16796b, null, null, null);
                if (cursorQuery == null) {
                    if (str2.length() == 0) {
                        return null;
                    }
                    throw new IOException("Cannot list ".concat(str2));
                }
                int i13 = i11;
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(i10);
                        if (string != null) {
                            String string2 = cursorQuery.getString(i12);
                            if (string2 == null) {
                                string2 = "";
                            }
                            boolean zA = kotlin.jvm.internal.r.a(cursorQuery.getString(2), "vnd.android.document/directory");
                            Set<String> set = o0.f16861a;
                            if (string2.length() <= 0 || string2.equals(".") || string2.equals("..")) {
                                i13++;
                                arrayList = arrayList;
                            } else {
                                int i14 = i10;
                                while (true) {
                                    if (i14 >= string2.length()) {
                                        break;
                                    }
                                    char cCharAt = string2.charAt(i14);
                                    if (cCharAt == '/' || cCharAt == '\\' || cCharAt == 0) {
                                        break;
                                    }
                                    i14++;
                                }
                                i13++;
                                arrayList = arrayList;
                            }
                            i10 = 0;
                            i12 = 1;
                        }
                        i10 = 0;
                        i12 = 1;
                    } finally {
                    }
                }
                ArrayList arrayList2 = arrayList;
                pg.f0 f0Var = pg.f0.f21461a;
                cursorQuery.close();
                lVar.invoke(new b(arrayList2.size(), 0, 0));
                i10 = 0;
                arrayList = arrayList2;
                i11 = i13;
            } else {
                arrayList = arrayList;
            }
        }
        ArrayList arrayList3 = arrayList;
        if (arrayList3.size() > 1) {
            qg.t.v(arrayList3, new j0());
        }
        return new d(arrayList3, i11, j10, false);
    }
}
