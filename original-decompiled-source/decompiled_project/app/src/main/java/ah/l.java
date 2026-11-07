package ah;

import ah.h;
import ah.h.b;
import android.view.View;
import android.view.ViewGroup;
import g8.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.ItemType;
import pg.f0;
import ph.n2;
import qg.z;

/* loaded from: classes2.dex */
public class l {
    public static n2 a() {
        return new n2(null);
    }

    public static final s0.j b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof s0.j) {
                return (s0.j) childAt;
            }
        }
        s0.j jVar = new s0.j(viewGroup.getContext());
        viewGroup.addView(jVar);
        return jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup c(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ah.j] */
    public static void d(File file, File file2) throws IOException {
        boolean zExists = file.exists();
        final k kVar = k.f587a;
        if (!zExists) {
            kVar.invoke(file, new m(file));
            throw null;
        }
        try {
            h hVarP = p(file);
            h.b bVar = new h(hVarP.f567a, i.f583a, new eh.p() { // from class: ah.j
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) throws o {
                    File f10 = (File) obj;
                    IOException e10 = (IOException) obj2;
                    r.e(f10, "f");
                    r.e(e10, "e");
                    if (kVar.invoke(f10, e10) != n.f588a) {
                        return f0.f21461a;
                    }
                    throw new o(f10, null, null);
                }
            }).new b();
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (!next.exists()) {
                    kVar.invoke(next, new m(next));
                    throw null;
                }
                File file3 = new File(file2, o(next, file));
                if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                    if (file3.isDirectory()) {
                        if (!f(file3)) {
                            kVar.invoke(file3, new e(next, file3, "The destination file already exists."));
                            throw null;
                        }
                    } else if (!file3.delete()) {
                        kVar.invoke(file3, new e(next, file3, "The destination file already exists."));
                        throw null;
                    }
                }
                if (next.isDirectory()) {
                    file3.mkdirs();
                } else {
                    e(next, file3);
                    if (file3.length() != next.length()) {
                        kVar.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs."));
                        throw null;
                    }
                }
            }
        } catch (o unused) {
        }
    }

    public static void e(File file, File file2) throws IOException {
        r.e(file, "<this>");
        if (!file.exists()) {
            throw new m(file);
        }
        if (file2.exists() && !file2.delete()) {
            throw new e(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new g(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                b.a(fileInputStream, fileOutputStream, 8192);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean f(File file) {
        r.e(file, "<this>");
        h.b bVar = new h(file, i.f584b, null).new b();
        while (true) {
            boolean z10 = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (!next.delete() && next.exists()) {
                    z10 = false;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public static String g(File file) {
        r.e(file, "<this>");
        String name = file.getName();
        r.d(name, "getName(...)");
        return x.T(name, '.', "");
    }

    public static String h(File file) {
        char c10 = File.separatorChar;
        String path = file.getPath();
        r.d(path, "getPath(...)");
        return c10 != '/' ? t.m(path, c10, '/') : path;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final f i(f fVar) {
        File file = fVar.f565a;
        ?? r62 = fVar.f566b;
        ArrayList arrayList = new ArrayList(r62.size());
        for (File file2 : r62) {
            String name = file2.getName();
            if (!r.a(name, ".")) {
                if (!r.a(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || r.a(((File) qg.x.J(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return new f(file, arrayList);
    }

    public static byte[] j(File file) throws IOException {
        r.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrCopyOf = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrCopyOf, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i12);
                r.d(bArrCopyOf, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    d dVar = new d(ItemType.CODE_ITEM);
                    dVar.write(i14);
                    b.a(fileInputStream, dVar, 8192);
                    int size = dVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrH = dVar.h();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    r.d(bArrCopyOf, "copyOf(...)");
                    qg.m.c(i10, bArrH, 0, bArrCopyOf, dVar.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static String k(File file, Charset charset) throws IOException {
        r.e(file, "<this>");
        r.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strD = p.d(inputStreamReader);
            inputStreamReader.close();
            return strD;
        } finally {
        }
    }

    public static File l(File file, File base) {
        r.e(file, "<this>");
        r.e(base, "base");
        return new File(o(file, base));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public static boolean m(File file, File file2) {
        f fVarN = n(file);
        ?? r02 = fVarN.f566b;
        f fVarN2 = n(file2);
        ?? r12 = fVarN2.f566b;
        if (fVarN.f565a.equals(fVarN2.f565a) && r02.size() >= r12.size()) {
            return r02.subList(0, r12.size()).equals(r12);
        }
        return false;
    }

    public static final f n(File file) {
        int length;
        List list;
        int iX;
        r.e(file, "<this>");
        String path = file.getPath();
        r.b(path);
        char c10 = File.separatorChar;
        int iX2 = x.x(path, c10, 0, 4);
        if (iX2 != 0) {
            length = (iX2 <= 0 || path.charAt(iX2 + (-1)) != ':') ? (iX2 == -1 && path.length() > 0 && w.i(path.charAt(x.u(path)), ':', false)) ? path.length() : 0 : iX2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c10 || (iX = x.x(path, c10, 2, 4)) < 0) {
            length = 1;
        } else {
            int iX3 = x.x(path, c10, iX + 1, 4);
            length = iX3 >= 0 ? iX3 + 1 : path.length();
        }
        String strSubstring = path.substring(0, length);
        r.d(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(length);
        r.d(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            list = z.f22752a;
        } else {
            List listP = x.P(strSubstring2, new char[]{c10});
            ArrayList arrayList = new ArrayList(qg.p.h(listP, 10));
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new f(new File(strSubstring), list);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String o(File file, File base) {
        r.e(file, "<this>");
        r.e(base, "base");
        f fVarI = i(n(file));
        ?? r12 = fVarI.f566b;
        f fVarI2 = i(n(base));
        ?? r32 = fVarI2.f566b;
        boolean zEquals = fVarI.f565a.equals(fVarI2.f565a);
        String string = null;
        if (zEquals) {
            int size = r32.size();
            int size2 = r12.size();
            int iMin = Math.min(size2, size);
            int i10 = 0;
            while (i10 < iMin && r.a(r12.get(i10), r32.get(i10))) {
                i10++;
            }
            StringBuilder sb = new StringBuilder();
            int i11 = size - 1;
            if (i10 <= i11) {
                while (!r.a(((File) r32.get(i11)).getName(), "..")) {
                    sb.append("..");
                    if (i11 != i10) {
                        sb.append(File.separatorChar);
                    }
                    if (i11 != i10) {
                        i11--;
                    } else {
                        if (i10 < size2) {
                            if (i10 < size) {
                                sb.append(File.separatorChar);
                            }
                            List listY = qg.x.y(i10, (List) r12);
                            String separator = File.separator;
                            r.d(separator, "separator");
                            qg.x.H(listY, sb, separator, null, CdexHeaderItem.DEBUG_INFO_BASE);
                        }
                        string = sb.toString();
                    }
                }
            } else {
                if (i10 < size2) {
                }
                string = sb.toString();
            }
        }
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    public static h p(File file) {
        r.e(file, "<this>");
        return new h(file, i.f583a, null);
    }

    public static void q(File file, byte[] array) throws IOException {
        r.e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            f0 f0Var = f0.f21461a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static void r(File file, String text, Charset charset) throws IOException {
        r.e(text, "text");
        r.e(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            t(fileOutputStream, text, charset);
            f0 f0Var = f0.f21461a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void t(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        r.e(text, "text");
        r.e(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            r.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        r.b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        r.d(byteBufferAllocate, "allocate(...)");
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            r.d(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i10 = i12;
        }
    }
}
