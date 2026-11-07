package androidx.credentials.playservices;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import java.util.Set;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1727c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f1725a = i10;
        this.f1726b = obj;
        this.f1727c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence charSequenceCoerceToText;
        int i10 = this.f1725a;
        Object obj = this.f1727c;
        Object obj2 = this.f1726b;
        switch (i10) {
            case 0:
                break;
            case 1:
                Context context = (Context) obj2;
                eh.l lVar = (eh.l) obj;
                String string = null;
                try {
                    Object systemService = context.getSystemService("clipboard");
                    ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                    if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0 && (itemAt = primaryClip.getItemAt(0)) != null && (charSequenceCoerceToText = itemAt.coerceToText(context)) != null) {
                        string = charSequenceCoerceToText.toString();
                    }
                } catch (Exception unused) {
                }
                if (string == null || mh.x.A(string)) {
                    org.bouncycastle.crypto.engines.a.b(context, R.string.editor_clipboard_empty, context, 0);
                } else {
                    Set<String> set = l9.w.f16906a;
                    String strA = l9.w.a(string);
                    lVar.invoke(strA);
                    Toast.makeText(context, context.getString(R.string.editor_clipboard_pasted_success, Integer.valueOf(strA.length())), 0).show();
                }
                break;
            default:
                float f10 = x8.s.f33139a;
                ((eh.l) obj2).invoke((String) ((n1) obj).getValue());
                break;
        }
        return f0.f21461a;
    }
}
