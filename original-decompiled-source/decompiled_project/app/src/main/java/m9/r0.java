package m9;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import m9.r0;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f17892a = new Handler(Looper.getMainLooper());

    public static final class a extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final File f17893a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17894b;

        public a(File file, String name) {
            kotlin.jvm.internal.r.e(file, "file");
            kotlin.jvm.internal.r.e(name, "name");
            this.f17893a = file;
            this.f17894b = name;
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes newAttributes, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback callback, Bundle bundle) {
            kotlin.jvm.internal.r.e(newAttributes, "newAttributes");
            kotlin.jvm.internal.r.e(cancellationSignal, "cancellationSignal");
            kotlin.jvm.internal.r.e(callback, "callback");
            if (cancellationSignal.isCanceled()) {
                callback.onLayoutCancelled();
            } else {
                callback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f17894b).setContentType(0).build(), printAttributes == null);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pages, final ParcelFileDescriptor destination, final CancellationSignal cancellationSignal, final PrintDocumentAdapter.WriteResultCallback callback) {
            kotlin.jvm.internal.r.e(pages, "pages");
            kotlin.jvm.internal.r.e(destination, "destination");
            kotlin.jvm.internal.r.e(cancellationSignal, "cancellationSignal");
            kotlin.jvm.internal.r.e(callback, "callback");
            new Thread(new Runnable() { // from class: m9.o0
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    ParcelFileDescriptor parcelFileDescriptor = destination;
                    r0.a aVar = this;
                    CancellationSignal cancellationSignal2 = cancellationSignal;
                    final PrintDocumentAdapter.WriteResultCallback writeResultCallback = callback;
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                        try {
                            FileInputStream fileInputStream = new FileInputStream(aVar.f17893a);
                            try {
                                byte[] bArr = new byte[65536];
                                while (!cancellationSignal2.isCanceled()) {
                                    int i10 = fileInputStream.read(bArr);
                                    if (i10 < 0) {
                                        pg.f0 f0Var = pg.f0.f21461a;
                                        fileInputStream.close();
                                        fileOutputStream.close();
                                        r0.f17892a.post(new Runnable() { // from class: m9.p0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                                            }
                                        });
                                        return;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                                r0.f17892a.post(new androidx.credentials.playservices.k(writeResultCallback, 1));
                                fileInputStream.close();
                                fileOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Exception e10) {
                        r0.f17892a.post(new Runnable() { // from class: m9.q0
                            @Override // java.lang.Runnable
                            public final void run() {
                                writeResultCallback.onWriteFailed(e10.getMessage());
                            }
                        });
                    }
                }
            }).start();
        }
    }

    public static String a(String title) {
        kotlin.jvm.internal.r.e(title, "title");
        Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|\\p{Cntrl}]");
        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(title).replaceAll("_");
        kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
        String strJ = mh.x.J(mh.x.J(mh.y.b0(80, mh.x.X(mh.x.W(strReplaceAll).toString(), '.')), ".pdf"), ".PDF");
        if (mh.x.A(strJ)) {
            strJ = "document";
        }
        return strJ.concat(".pdf");
    }
}
