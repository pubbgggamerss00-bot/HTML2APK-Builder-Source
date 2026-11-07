package f9;

import android.content.Context;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$readFullHtmlContent$2", f = "ProjectEditorScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class bg extends vg.i implements eh.p<ph.i0, tg.e<? super u4>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f9134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f9135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(Context context, Uri uri, tg.e eVar) {
        super(2, eVar);
        this.f9134a = uri;
        this.f9135b = context;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new bg(this.f9135b, this.f9134a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super u4> eVar) {
        return ((bg) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[Catch: all -> 0x00c9, OutOfMemoryError -> 0x00cf, TryCatch #4 {OutOfMemoryError -> 0x00cf, all -> 0x00c9, blocks: (B:3:0x000b, B:5:0x0011, B:10:0x0020, B:12:0x0028, B:25:0x0061, B:44:0x00bf, B:48:0x00c5, B:49:0x00c8, B:13:0x0033, B:16:0x003c, B:19:0x0045, B:20:0x004e, B:23:0x0057, B:46:0x00c3, B:27:0x0067, B:28:0x0086, B:30:0x008c, B:32:0x0092, B:34:0x009a, B:40:0x00a8, B:43:0x00b0, B:37:0x00a1), top: B:57:0x000b, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String path;
        InputStream fileInputStream;
        boolean z10;
        int i10;
        Uri uri = this.f9134a;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        try {
            String scheme = uri.getScheme();
            if (scheme == null) {
                path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                fileInputStream = new FileInputStream(new File(path));
            } else {
                int iHashCode = scheme.hashCode();
                if (iHashCode != 3143036) {
                    if (iHashCode == 951530617 && scheme.equals("content")) {
                        fileInputStream = this.f9135b.getContentResolver().openInputStream(uri);
                    }
                } else if (scheme.equals("file")) {
                    String path2 = uri.getPath();
                    if (path2 == null) {
                        path2 = "";
                    }
                    fileInputStream = new FileInputStream(new File(path2));
                } else {
                    path = uri.getPath();
                    if (path == null) {
                    }
                    fileInputStream = new FileInputStream(new File(path));
                }
            }
            if (fileInputStream == null) {
                return new u4("", true);
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, mh.a.f18238b), 8192);
                StringBuilder sb = new StringBuilder(Math.min(8388608, PKIFailureInfo.badCertTemplate));
                char[] cArr = new char[16384];
                while (sb.length() < 8388608 && (i10 = bufferedReader.read(cArr)) > 0) {
                    int length = 8388608 - sb.length();
                    if (i10 > length) {
                        sb.append(cArr, 0, length);
                        z10 = true;
                        break;
                    }
                    sb.append(cArr, 0, i10);
                }
                z10 = false;
                if (!z10 && bufferedReader.read() != -1) {
                    z10 = true;
                }
                String string = sb.toString();
                kotlin.jvm.internal.r.d(string, "toString(...)");
                u4 u4Var = new u4(string, !z10);
                fileInputStream.close();
                return u4Var;
            } finally {
            }
        } catch (OutOfMemoryError unused) {
            return new u4("", false);
        } catch (Throwable unused2) {
            return new u4("", true);
        }
    }
}
