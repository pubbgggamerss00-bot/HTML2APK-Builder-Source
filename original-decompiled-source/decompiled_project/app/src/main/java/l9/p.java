package l9;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import l9.n;
import ph.z0;

/* loaded from: classes.dex */
public final class p {
    public static final n a(Context context, ClipData.Item item) {
        n cVar;
        kotlin.jvm.internal.r.e(context, "context");
        CharSequence text = item.getText();
        if (text != null) {
            return mh.x.A(text) ? n.a.f16854a : text.length() > 8388608 ? n.d.f16857a : new n.c(text.toString());
        }
        Uri uri = item.getUri();
        if (uri == null) {
            String htmlText = item.getHtmlText();
            return (htmlText == null || mh.x.A(htmlText)) ? n.a.f16854a : htmlText.length() > 8388608 ? n.d.f16857a : new n.c(htmlText);
        }
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return n.a.f16854a;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, mh.a.f18238b), 8192);
            try {
                StringBuilder sb = new StringBuilder(Math.min(8388608, 65536));
                char[] cArr = new char[16384];
                while (true) {
                    int i10 = bufferedReader.read(cArr);
                    if (i10 < 0) {
                        if (mh.x.A(sb)) {
                            cVar = n.a.f16854a;
                        } else {
                            String string = sb.toString();
                            kotlin.jvm.internal.r.d(string, "toString(...)");
                            cVar = new n.c(string);
                        }
                        bufferedReader.close();
                        return cVar;
                    }
                    if (sb.length() + i10 > 8388608) {
                        n.d dVar = n.d.f16857a;
                        bufferedReader.close();
                        return dVar;
                    }
                    sb.append(cArr, 0, i10);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ah.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return n.b.f16855a;
        } catch (OutOfMemoryError unused2) {
            return n.d.f16857a;
        }
    }

    public static Object b(Context context, vg.i iVar) {
        ClipData primaryClip;
        ClipData.Item itemAt;
        try {
            Object systemService = context.getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
                if (primaryClip.getItemCount() != 0 && (itemAt = primaryClip.getItemAt(0)) != null) {
                    if (itemAt.getText() != null || itemAt.getUri() == null) {
                        return a(context, itemAt);
                    }
                    wh.c cVar = z0.f21632a;
                    return ph.h.e(wh.b.f31563c, new o(context, itemAt, null), iVar);
                }
                return n.a.f16854a;
            }
            return n.a.f16854a;
        } catch (RuntimeException unused) {
            return n.b.f16855a;
        }
    }
}
