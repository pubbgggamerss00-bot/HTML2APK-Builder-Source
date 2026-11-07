package l9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.basitce.htmltoapk.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import ph.v1;

/* loaded from: classes.dex */
public final class e0 {
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bb, code lost:
    
        throw new java.lang.IllegalArgumentException(r16.getString(com.basitce.htmltoapk.R.string.pdf_invalid), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r7 = pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r4 = android.os.ParcelFileDescriptor.open(r3, 268435456);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r7 = new android.graphics.pdf.PdfRenderer(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r7.getPageCount() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        ch.a.a(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        ah.c.a(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (kotlin.jvm.internal.r.a(r17.getScheme(), "content") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        r1 = r16.getContentResolver().query(r17, new java.lang.String[]{"_display_name"}, null, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r1 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r1.moveToFirst() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        r4 = r1.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        r4 = r17.getLastPathSegment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        r1 = "document.pdf";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (r4 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        r4 = "document.pdf";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        r4 = mh.x.T(r4, '/', r4);
        r4 = mh.x.T(r4, '\\', r4);
        r5 = java.util.regex.Pattern.compile("[\\\\/:*?\"<>|]");
        kotlin.jvm.internal.r.d(r5, "compile(...)");
        r4 = r5.matcher(r4).replaceAll("_");
        kotlin.jvm.internal.r.d(r4, "replaceAll(...)");
        r4 = mh.y.b0(org.jf.dexlib2.dexbacked.raw.CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, mh.x.W(r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if (mh.x.A(r4) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        if (r4.equals(".") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0112, code lost:
    
        if (r4.equals("..") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0114, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0115, code lost:
    
        if (r11 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0120, code lost:
    
        if (mh.t.i(r1, ".pdf", true) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0123, code lost:
    
        r1 = r1 + ".pdf";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0132, code lost:
    
        r4 = new java.io.File(r18, r1);
        ph.v1.e(r19.getContext());
        java.nio.file.Files.move(r3.toPath(), r4.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING, java.nio.file.StandardCopyOption.ATOMIC_MOVE);
        r0 = r18.listFiles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0156, code lost:
    
        if (r0 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = r0.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
    
        if (r5 >= r2) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        r6 = r0[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0167, code lost:
    
        if (r6.isFile() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016d, code lost:
    
        if (r6.equals(r4) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        if (ah.l.g(r6).equalsIgnoreCase(com.basitce.htmltoapk.domain.model.ProjectKind.PDF) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        r1.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017e, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0181, code lost:
    
        r0 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        if (r13 >= r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0187, code lost:
    
        r2 = r1.get(r13);
        r13 = r13 + 1;
        ((java.io.File) r2).delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0196, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0197, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File a(Context context, Uri uri, File file, vg.i iVar) throws IOException {
        file.mkdirs();
        File fileCreateTempFile = File.createTempFile("pdf_import_", ".tmp", file);
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                String string = context.getString(R.string.pdf_invalid);
                kotlin.jvm.internal.r.d(string, "getString(...)");
                throw new IllegalStateException(string.toString());
            }
            try {
                kotlin.jvm.internal.r.b(fileCreateTempFile);
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    byte[] bArr = new byte[32768];
                    long j10 = 0;
                    while (true) {
                        v1.e(iVar.getContext());
                        int i10 = inputStreamOpenInputStream.read(bArr);
                        int i11 = 0;
                        if (i10 < 0) {
                            break;
                        }
                        j10 += i10;
                        if (j10 > 104857600) {
                            String string2 = context.getString(R.string.pdf_too_large);
                            kotlin.jvm.internal.r.d(string2, "getString(...)");
                            throw new IllegalArgumentException(string2.toString());
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ah.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } finally {
            }
        } finally {
            fileCreateTempFile.delete();
        }
    }

    public static File b(Context context, File file) throws FileNotFoundException {
        kotlin.jvm.internal.r.e(context, "context");
        File file2 = new File(context.getCacheDir(), c2.u.a("pdf_cover_", ".png", System.currentTimeMillis()));
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
        try {
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
            int i10 = 0;
            try {
                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                try {
                    double height = pageOpenPage.getHeight();
                    int width = pageOpenPage.getWidth();
                    if (width < 1) {
                        width = 1;
                    }
                    double d10 = height / width;
                    int i11 = 1024;
                    if (d10 < 1.0d) {
                        int i12 = (int) (1024 / d10);
                        i11 = i12 > 2048 ? 2048 : i12;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, jh.j.m((int) (i11 * d10), 1, 2048), Bitmap.Config.ARGB_8888);
                    kotlin.jvm.internal.r.d(bitmapCreateBitmap, "createBitmap(...)");
                    try {
                        bitmapCreateBitmap.eraseColor(-1);
                        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.close();
                            ch.a.a(pageOpenPage, null);
                            ch.a.a(pdfRenderer, null);
                            ah.c.a(parcelFileDescriptorOpen, null);
                            File[] fileArrListFiles = context.getCacheDir().listFiles();
                            if (fileArrListFiles != null) {
                                ArrayList arrayList = new ArrayList();
                                for (File file3 : fileArrListFiles) {
                                    String name = file3.getName();
                                    kotlin.jvm.internal.r.d(name, "getName(...)");
                                    if (mh.t.p(name, "pdf_cover_", false) && !file3.equals(file2)) {
                                        arrayList.add(file3);
                                    }
                                }
                                int size = arrayList.size();
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    ((File) obj).delete();
                                }
                            }
                            return file2;
                        } finally {
                        }
                    } finally {
                        bitmapCreateBitmap.recycle();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
