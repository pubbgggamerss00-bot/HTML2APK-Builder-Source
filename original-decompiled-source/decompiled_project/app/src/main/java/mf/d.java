package mf;

import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ve.a0;
import ve.b0;
import ve.d0;
import ve.l0;
import ve.n0;
import ve.o0;
import ve.p0;

/* loaded from: classes2.dex */
public final class d extends c5.p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18173a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final e f18174b;

    public static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f18175a;

        /* renamed from: b, reason: collision with root package name */
        public final f f18176b;

        /* renamed from: c, reason: collision with root package name */
        public final mf.b f18177c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18178d;

        /* renamed from: e, reason: collision with root package name */
        public final int f18179e;

        /* renamed from: f, reason: collision with root package name */
        public final int f18180f;

        /* renamed from: g, reason: collision with root package name */
        public final int f18181g;

        /* renamed from: h, reason: collision with root package name */
        public final int f18182h;

        /* renamed from: i, reason: collision with root package name */
        public final lc.g f18183i;

        /* renamed from: j, reason: collision with root package name */
        public final File f18184j;

        /* renamed from: k, reason: collision with root package name */
        public final d f18185k;

        public a(File file, f fVar, String str, mf.b bVar, int i10, int i11, int i12, int i13, int i14, byte[] bArr, d dVar) {
            this.f18184j = file;
            this.f18176b = fVar;
            this.f18175a = str;
            this.f18177c = bVar;
            this.f18178d = i10;
            this.f18179e = i11;
            this.f18180f = i12;
            this.f18181g = i13;
            this.f18182h = i14;
            this.f18183i = (bArr == null || bArr.length < 10) ? null : new lc.g(bArr);
            this.f18185k = dVar;
        }

        public static d0 k(File file, String str) throws IOException {
            p0 p0VarH;
            try {
                int i10 = 0;
                if (!file.getName().toLowerCase().endsWith(".ttc")) {
                    return new b0(false, true).e(file);
                }
                o0 o0Var = new o0(file);
                while (true) {
                    try {
                        if (i10 >= o0Var.f30889b) {
                            p0VarH = null;
                            break;
                        }
                        p0VarH = o0Var.h(i10);
                        if (p0VarH.z().equals(str)) {
                            break;
                        }
                        i10++;
                    } catch (IOException e10) {
                        Log.e("PdfBox-Android", e10.getMessage(), e10);
                        o0Var.close();
                        return null;
                    }
                }
                if (p0VarH != null) {
                    return (d0) p0VarH;
                }
                o0Var.close();
                throw new IOException("Font " + str + " not found in " + file);
            } catch (IOException e11) {
                Log.w("PdfBox-Android", "Could not load font file: " + file, e11);
                return null;
            }
        }

        public static p0 l(File file, String str) throws IOException {
            p0 p0VarH;
            int i10 = 0;
            if (!file.getName().toLowerCase().endsWith(".ttc")) {
                return new l0(false, true).b(file);
            }
            o0 o0Var = new o0(file);
            while (true) {
                try {
                    if (i10 >= o0Var.f30889b) {
                        p0VarH = null;
                        break;
                    }
                    p0VarH = o0Var.h(i10);
                    if (p0VarH.z().equals(str)) {
                        break;
                    }
                    i10++;
                } catch (IOException e10) {
                    o0Var.close();
                    throw e10;
                }
            }
            if (p0VarH != null) {
                return p0VarH;
            }
            o0Var.close();
            throw new IOException("Font " + str + " not found in " + file);
        }

        @Override // mf.g
        public final mf.b a() {
            return this.f18177c;
        }

        @Override // mf.g
        public final int b() {
            return this.f18180f;
        }

        @Override // mf.g
        public final int c() {
            return this.f18181g;
        }

        @Override // mf.g
        public final int d() {
            return this.f18179e;
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x008c A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #3 {all -> 0x005a, blocks: (B:3:0x0001, B:5:0x0010, B:11:0x001c, B:17:0x002a, B:30:0x0052, B:44:0x008c, B:31:0x0056, B:32:0x0059, B:35:0x005c, B:36:0x0063, B:37:0x0064, B:38:0x006d, B:39:0x0071, B:42:0x0077), top: B:53:0x0001, inners: #0 }] */
        @Override // mf.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized qe.a e() {
            File file;
            FileInputStream fileInputStream;
            try {
                SoftReference softReference = (SoftReference) this.f18185k.f18174b.f18186a.get(this);
                FileInputStream fileInputStream2 = null;
                aVarL = null;
                qe.a aVarL = null;
                qe.a aVar = softReference != null ? (qe.a) softReference.get() : null;
                if (aVar != null) {
                    return aVar;
                }
                int iOrdinal = this.f18176b.ordinal();
                if (iOrdinal == 0) {
                    String str = this.f18175a;
                    File file2 = this.f18184j;
                    try {
                        aVarL = l(file2, str);
                    } catch (IOException e10) {
                        Log.w("PdfBox-Android", "Could not load font file: " + file2, e10);
                    }
                } else if (iOrdinal == 1) {
                    aVarL = k(this.f18184j, this.f18175a);
                } else {
                    if (iOrdinal != 2) {
                        throw new RuntimeException("can't happen");
                    }
                    try {
                        file = this.f18184j;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                    }
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            aVarL = we.d.b(fileInputStream);
                        } catch (IOException e11) {
                            e = e11;
                            Log.w("PdfBox-Android", "Could not load font file: " + file, e);
                            ef.a.b(fileInputStream);
                            if (aVarL != null) {
                            }
                            return aVarL;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        ef.a.b(fileInputStream2);
                        throw th;
                    }
                    ef.a.b(fileInputStream);
                }
                if (aVarL != null) {
                    this.f18185k.f18174b.f18186a.put(this, new SoftReference(aVarL));
                }
                return aVarL;
            } catch (Throwable th4) {
                throw th4;
            }
        }

        @Override // mf.g
        public final f f() {
            return this.f18176b;
        }

        @Override // mf.g
        public final int g() {
            return this.f18182h;
        }

        @Override // mf.g
        public final lc.g h() {
            return this.f18183i;
        }

        @Override // mf.g
        public final String i() {
            return this.f18175a;
        }

        @Override // mf.g
        public final int j() {
            return this.f18178d;
        }

        @Override // mf.g
        public final String toString() {
            return super.toString() + " " + this.f18184j;
        }
    }

    public static final class b extends a {
        public b(File file, f fVar, String str) {
            super(file, fVar, str, null, 0, 0, 0, 0, 0, null, null);
        }
    }

    public d(e eVar) throws Throwable {
        this.f18174b = eVar;
        try {
            c0(new File("/system/fonts/DroidSans.ttf"));
            c0(new File("/system/fonts/DroidSans-Bold.ttf"));
            c0(new File("/system/fonts/DroidSansMono.ttf"));
        } catch (IOException e10) {
            e10.printStackTrace();
            try {
                ye.c cVar = new ye.c();
                cVar.f34404a = null;
                ArrayList arrayListA = cVar.a();
                ArrayList arrayList = new ArrayList(arrayListA.size());
                int size = arrayListA.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayListA.get(i10);
                    i10++;
                    arrayList.add(new File((URI) obj));
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                ArrayList arrayListG0 = g0(arrayList);
                if (arrayListG0 != null && !arrayListG0.isEmpty()) {
                    this.f18173a.addAll(arrayListG0);
                    return;
                }
                Log.w("PdfBox-Android", "Building on-disk font cache, this may take a while");
                i0(arrayList);
                h0();
                Log.w("PdfBox-Android", "Finished building on-disk font cache, found " + this.f18173a.size() + " fonts");
            } catch (AccessControlException e11) {
                Log.e("PdfBox-Android", "Error accessing the file system", e11);
            }
        }
    }

    public static File f0() {
        String property = System.getProperty("pdfbox.fontcache");
        if ((property == null || !new File(property).isDirectory() || !new File(property).canWrite()) && ((property = System.getProperty("user.home")) == null || !new File(property).isDirectory() || !new File(property).canWrite())) {
            property = System.getProperty("java.io.tmpdir");
        }
        return new File(property, ".pdfbox.cache");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(File file) throws Throwable {
        o0 o0Var;
        IOException e10;
        o0 o0Var2 = null;
        try {
            o0Var = new o0(file);
            for (int i10 = 0; i10 < o0Var.f30889b; i10++) {
                try {
                    try {
                        d0(o0Var.h(i10), file);
                    } catch (IOException e11) {
                        e10 = e11;
                        Log.w("PdfBox-Android", "Could not load font file: " + file, e10);
                        if (o0Var != null) {
                            o0Var.close();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    o0Var2 = o0Var;
                    if (o0Var2 != null) {
                        o0Var2.close();
                    }
                    throw th;
                }
            }
            o0Var.close();
        } catch (IOException e12) {
            o0Var = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            if (o0Var2 != null) {
            }
            throw th;
        }
    }

    public final void c0(File file) throws IOException {
        try {
            if (file.getPath().toLowerCase().endsWith(".otf")) {
                d0(new b0(false, true).e(file), file);
            } else {
                d0(new l0(false, true).b(file), file);
            }
        } catch (IOException e10) {
            Log.w("PdfBox-Android", "Could not load font file: " + file, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList] */
    public final void d0(p0 p0Var, File file) throws IOException {
        f fVar;
        f fVar2;
        String str;
        ?? r15;
        f fVar3;
        f fVar4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte[] bArr;
        f fVar5;
        int i15;
        f fVar6;
        mf.b bVar;
        mf.b bVar2;
        File file2 = file;
        f fVar7 = f.f18187a;
        ?? r42 = this.f18173a;
        try {
            try {
                String strZ = p0Var.z();
                HashMap map = p0Var.f30898b;
                if (strZ == null || !p0Var.z().contains("|")) {
                    try {
                        if (p0Var.z() == null) {
                            ?? r152 = r42;
                            f fVar8 = fVar7;
                            str = "Could not load font file: ";
                            r152.add(new b(file2, fVar8, "*skipnoname*"));
                            Log.w("PdfBox-Android", "Missing 'name' entry for PostScript name in font " + file2);
                            r42 = fVar8;
                            fVar7 = r152;
                        } else {
                            if (p0Var.l() == null) {
                                r42.add(new b(file2, fVar7, p0Var.z()));
                                p0Var.close();
                                return;
                            }
                            int i16 = p0Var.l().f30913q;
                            a0 a0VarM = p0Var.M();
                            if (a0VarM != null) {
                                try {
                                    i10 = a0VarM.f30770u;
                                    i11 = a0VarM.f30757h;
                                    i12 = (int) a0VarM.D;
                                    fVar4 = r42;
                                } catch (IOException e10) {
                                    e = e10;
                                    fVar4 = r42;
                                }
                                try {
                                    i13 = (int) a0VarM.E;
                                    i14 = i11;
                                    bArr = a0VarM.f30771v;
                                    fVar5 = fVar4;
                                    i15 = i10;
                                } catch (IOException e11) {
                                    e = e11;
                                    file2 = file;
                                    str = "Could not load font file: ";
                                    fVar3 = fVar7;
                                    r15 = fVar4;
                                    r15.add(new b(file2, fVar3, "*skipexception*"));
                                    Log.w("PdfBox-Android", str + file2, e);
                                    p0Var.close();
                                    return;
                                }
                            } else {
                                i14 = -1;
                                i15 = -1;
                                i12 = 0;
                                i13 = 0;
                                bArr = null;
                                fVar5 = r42;
                            }
                            try {
                                try {
                                    if (p0Var instanceof d0) {
                                        try {
                                            if (((d0) p0Var).f30898b.containsKey("CFF ")) {
                                                d0 d0Var = (d0) p0Var;
                                                if (!d0Var.f30788f) {
                                                    throw new UnsupportedOperationException("TTF fonts do not have a CFF table");
                                                }
                                                re.g gVar = ((ve.b) d0Var.Z("CFF ")).f30776f;
                                                if (gVar instanceof re.a) {
                                                    re.a aVar = (re.a) gVar;
                                                    bVar = new mf.b(aVar.f23449h, aVar.f23447f, aVar.f23448g);
                                                } else {
                                                    bVar = null;
                                                }
                                                ?? r92 = fVar5;
                                                try {
                                                } catch (IOException e12) {
                                                    e = e12;
                                                    str = "Could not load font file: ";
                                                    fVar6 = fVar7;
                                                }
                                                try {
                                                    r92.add(new a(file, f.f18188b, p0Var.z(), bVar, i14, i15, i12, i13, i16, bArr, this));
                                                } catch (IOException e13) {
                                                    e = e13;
                                                    fVar6 = fVar7;
                                                    str = "Could not load font file: ";
                                                    fVar7 = r92;
                                                    file2 = file;
                                                    fVar3 = fVar6;
                                                    r15 = fVar7;
                                                    r15.add(new b(file2, fVar3, "*skipexception*"));
                                                    Log.w("PdfBox-Android", str + file2, e);
                                                    p0Var.close();
                                                    return;
                                                }
                                            }
                                        } catch (IOException e14) {
                                            e = e14;
                                            str = "Could not load font file: ";
                                            fVar6 = fVar7;
                                            fVar7 = fVar5;
                                        }
                                    }
                                    str = "Could not load font file: ";
                                    int i17 = i12;
                                    int i18 = i14;
                                    ?? r153 = fVar5;
                                    if (map.containsKey("gcid")) {
                                        byte[] bArrD0 = p0Var.d0((n0) map.get("gcid"));
                                        Charset charset = wf.a.f31520a;
                                        String str2 = new String(bArrD0, 10, 64, charset);
                                        String strSubstring = str2.substring(0, str2.indexOf(0));
                                        String str3 = new String(bArrD0, 76, 64, charset);
                                        bVar2 = new mf.b(bArrD0[141] & 255 & (bArrD0[140] << 8), strSubstring, str3.substring(0, str3.indexOf(0)));
                                    } else {
                                        bVar2 = null;
                                    }
                                    file2 = file;
                                    f fVar9 = fVar7;
                                    r153.add(new a(file2, fVar9, p0Var.z(), bVar2, i18, i15, i17, i13, i16, bArr, this));
                                    r42 = fVar9;
                                    fVar7 = r153;
                                } catch (IOException e15) {
                                    e = e15;
                                }
                            } catch (IOException e16) {
                                e = e16;
                                fVar = fVar5;
                                fVar2 = fVar7;
                                file2 = file;
                                str = "Could not load font file: ";
                                fVar3 = fVar2;
                                r15 = fVar;
                                r15.add(new b(file2, fVar3, "*skipexception*"));
                                Log.w("PdfBox-Android", str + file2, e);
                                p0Var.close();
                                return;
                            }
                        }
                    } catch (IOException e17) {
                        e = e17;
                        fVar3 = r42;
                        r15 = fVar7;
                    }
                } else {
                    r42.add(new b(file2, fVar7, "*skippipeinname*"));
                    Log.w("PdfBox-Android", "Skipping font with '|' in name " + p0Var.z() + " in file " + file2);
                }
                p0Var.close();
            } catch (Throwable th2) {
                p0Var.close();
                throw th2;
            }
        } catch (IOException e18) {
            e = e18;
            fVar = r42;
            fVar2 = fVar7;
        }
    }

    public final void e0(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            we.d dVarB = we.d.b(fileInputStream);
            String str = dVarB.f31509a;
            f fVar = f.f18189c;
            ArrayList arrayList = this.f18173a;
            if (str == null) {
                arrayList.add(new b(file, fVar, "*skipnoname*"));
                Log.w("PdfBox-Android", "Missing 'name' entry for PostScript name in font " + file);
                return;
            }
            if (!str.contains("|")) {
                arrayList.add(new a(file, fVar, dVarB.f31509a, null, -1, -1, 0, 0, -1, null, this));
                return;
            }
            arrayList.add(new b(file, fVar, "*skippipeinname*"));
            Log.w("PdfBox-Android", "Skipping font with '|' in name " + dVarB.f31509a + " in file " + file);
        } catch (IOException e10) {
            Log.w("PdfBox-Android", "Could not load font file: " + file, e10);
        } finally {
            fileInputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList g0(ArrayList arrayList) throws Throwable {
        File fileF0;
        boolean zExists;
        BufferedReader bufferedReader;
        ?? r21;
        BufferedReader bufferedReader2;
        ArrayList arrayList2;
        mf.b bVar;
        byte[] bArr;
        int i10;
        byte[] bArr2;
        HashSet hashSet = new HashSet(arrayList.size());
        int size = arrayList.size();
        char c10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            hashSet.add(((File) obj).getAbsolutePath());
        }
        ArrayList arrayList3 = new ArrayList();
        try {
            fileF0 = f0();
        } catch (SecurityException unused) {
            fileF0 = null;
        }
        try {
            zExists = fileF0.exists();
        } catch (SecurityException unused2) {
            zExists = false;
            if (zExists) {
            }
            if (!hashSet.isEmpty()) {
            }
        }
        if (zExists) {
            arrayList2 = null;
        } else {
            try {
                bufferedReader2 = new BufferedReader(new FileReader(fileF0));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = line.split("\\|", 10);
                            if (strArrSplit.length < 10) {
                                Log.w("PdfBox-Android", "Incorrect line '" + line + "' in font disk cache is skipped");
                            } else {
                                String str = strArrSplit[c10];
                                f fVarValueOf = f.valueOf(strArrSplit[1]);
                                if (strArrSplit[2].length() > 0) {
                                    String[] strArrSplit2 = strArrSplit[2].split("-");
                                    bVar = new mf.b(Integer.parseInt(strArrSplit2[2]), strArrSplit2[c10], strArrSplit2[1]);
                                } else {
                                    bVar = null;
                                }
                                if (strArrSplit[3].length() > 0) {
                                    bArr = null;
                                    bArr = null;
                                    try {
                                        i10 = (int) Long.parseLong(strArrSplit[3], 16);
                                    } catch (IOException e10) {
                                        e = e10;
                                        r21 = bArr;
                                        Log.w("PdfBox-Android", "Error loading font cache, will be re-built", e);
                                        ef.a.b(bufferedReader2);
                                        return r21;
                                    }
                                } else {
                                    bArr = null;
                                    i10 = -1;
                                }
                                int i12 = strArrSplit[4].length() > 0 ? (int) Long.parseLong(strArrSplit[4], 16) : -1;
                                int i13 = (int) Long.parseLong(strArrSplit[5], 16);
                                int i14 = (int) Long.parseLong(strArrSplit[6], 16);
                                int i15 = strArrSplit[7].length() > 0 ? (int) Long.parseLong(strArrSplit[7], 16) : -1;
                                if (strArrSplit[8].length() > 0) {
                                    byte[] bArr3 = new byte[10];
                                    int i16 = 0;
                                    for (int i17 = 10; i16 < i17; i17 = 10) {
                                        int i18 = i16 * 2;
                                        bArr3[i16] = (byte) (Integer.parseInt(strArrSplit[8].substring(i18, i18 + 2), 16) & 255);
                                        i16++;
                                        i12 = i12;
                                    }
                                    bArr2 = bArr3;
                                } else {
                                    bArr2 = bArr;
                                }
                                int i19 = i12;
                                File file = new File(strArrSplit[9]);
                                if (file.exists()) {
                                    arrayList3.add(new a(file, fVarValueOf, str, bVar, i10, i19, i13, i14, i15, bArr2, this));
                                } else {
                                    Log.d("PdfBox-Android", "Font file " + file.getAbsolutePath() + " not found, skipped");
                                }
                                hashSet.remove(file.getAbsolutePath());
                                c10 = 0;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            r21 = 0;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        ef.a.b(bufferedReader);
                        throw th;
                    }
                }
                arrayList2 = null;
                ef.a.b(bufferedReader2);
            } catch (IOException e12) {
                e = e12;
                r21 = 0;
                bufferedReader2 = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                ef.a.b(bufferedReader);
                throw th;
            }
        }
        if (!hashSet.isEmpty()) {
            return arrayList3;
        }
        Log.w("PdfBox-Android", "New fonts found, font cache will be re-built");
        return arrayList2;
    }

    public final void h0() throws Throwable {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(f0()));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ArrayList arrayList = this.f18173a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    a aVar = (a) obj;
                    String str = aVar.f18175a;
                    mf.b bVar = aVar.f18177c;
                    bufferedWriter.write(str.trim());
                    bufferedWriter.write("|");
                    bufferedWriter.write(aVar.f18176b.toString());
                    bufferedWriter.write("|");
                    if (bVar != null) {
                        bufferedWriter.write(bVar.f18169a + '-' + bVar.f18170b + '-' + bVar.f18171c);
                    }
                    bufferedWriter.write("|");
                    int i11 = aVar.f18178d;
                    if (i11 > -1) {
                        bufferedWriter.write(Integer.toHexString(i11));
                    }
                    bufferedWriter.write("|");
                    int i12 = aVar.f18179e;
                    if (i12 > -1) {
                        bufferedWriter.write(Integer.toHexString(i12));
                    }
                    bufferedWriter.write("|");
                    bufferedWriter.write(Integer.toHexString(aVar.f18180f));
                    bufferedWriter.write("|");
                    bufferedWriter.write(Integer.toHexString(aVar.f18181g));
                    bufferedWriter.write("|");
                    int i13 = aVar.f18182h;
                    if (i13 > -1) {
                        bufferedWriter.write(Integer.toHexString(i13));
                    }
                    bufferedWriter.write("|");
                    lc.g gVar = aVar.f18183i;
                    if (gVar != null) {
                        byte[] bArr = (byte[]) gVar.f16945b;
                        for (int i14 = 0; i14 < 10; i14++) {
                            String hexString = Integer.toHexString(bArr[i14]);
                            if (hexString.length() == 1) {
                                bufferedWriter.write(48);
                            }
                            bufferedWriter.write(hexString);
                        }
                    }
                    bufferedWriter.write("|");
                    bufferedWriter.write(aVar.f18184j.getAbsolutePath());
                    bufferedWriter.newLine();
                }
                ef.a.b(bufferedWriter);
            } catch (IOException e10) {
                e = e10;
                bufferedWriter2 = bufferedWriter;
                Log.w("PdfBox-Android", "Could not write to font cache", e);
                Log.w("PdfBox-Android", "Installed fonts information will have to be reloaded for each start");
                Log.w("PdfBox-Android", "You can assign a directory to the 'pdfbox.fontcache' property");
                ef.a.b(bufferedWriter2);
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                ef.a.b(bufferedWriter2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (SecurityException unused) {
        }
    }

    public final void i0(ArrayList arrayList) throws Throwable {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            File file = (File) obj;
            try {
                String lowerCase = file.getPath().toLowerCase();
                if (lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf")) {
                    c0(file);
                } else if (lowerCase.endsWith(".ttc") || lowerCase.endsWith(".otc")) {
                    b0(file);
                } else if (lowerCase.endsWith(".pfb")) {
                    e0(file);
                }
            } catch (IOException e10) {
                Log.w("PdfBox-Android", "Error parsing font " + file.getPath(), e10);
            }
        }
    }
}
