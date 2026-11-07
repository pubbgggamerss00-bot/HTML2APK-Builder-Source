package y2;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@pg.d
/* loaded from: classes.dex */
public final class y implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f33774a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33775b;

    /* renamed from: c, reason: collision with root package name */
    public int f33776c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f33777d;

    /* renamed from: e, reason: collision with root package name */
    public int f33778e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33779f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f33780g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f33781h = true;

    public y(c0 c0Var, i0 i0Var, boolean z10) {
        this.f33774a = i0Var;
        this.f33775b = z10;
        this.f33777d = c0Var;
    }

    public final void b(i iVar) {
        this.f33776c++;
        try {
            this.f33780g.add(iVar);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f33781h;
        if (!z10) {
            return z10;
        }
        this.f33776c++;
        return true;
    }

    public final boolean c() {
        int i10 = this.f33776c - 1;
        this.f33776c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f33780g;
            if (!arrayList.isEmpty()) {
                this.f33774a.f33733a.f33713e.invoke(qg.x.e0(arrayList));
                arrayList.clear();
            }
        }
        return this.f33776c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f33781h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f33780g.clear();
        this.f33776c = 0;
        this.f33781h = false;
        ArrayList arrayList = this.f33774a.f33733a.f33717i;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.jvm.internal.r.a(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f33781h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f33781h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f33781h;
        return z10 ? this.f33775b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f33781h;
        if (z10) {
            b(new a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public final void d(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f33781h;
        if (!z10) {
            return z10;
        }
        b(new g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f33781h;
        if (!z10) {
            return z10;
        }
        b(new h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f33781h;
        if (!z10) {
            return z10;
        }
        b(new l());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        c0 c0Var = this.f33777d;
        return TextUtils.getCapsMode(c0Var.f33682a.f27761b, t2.j0.e(c0Var.f33683b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f33779f = z10;
        if (z10) {
            this.f33778e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return q.a(this.f33777d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (t2.j0.b(this.f33777d.f33683b)) {
            return null;
        }
        return d0.a(this.f33777d).f27761b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return d0.b(this.f33777d, i10).f27761b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return d0.c(this.f33777d, i10).f27761b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f33781h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    b(new b0(0, this.f33777d.f33682a.f27761b.length()));
                    break;
                case R.id.cut:
                    d(277);
                    return false;
                case R.id.copy:
                    d(278);
                    return false;
                case R.id.paste:
                    d(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f33781h;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
                this.f33774a.f33733a.f33714f.invoke(new n(i11));
            } else {
                i11 = 1;
                this.f33774a.f33733a.f33714f.invoke(new n(i11));
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f33781h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        e eVar;
        boolean z13 = this.f33781h;
        if (!z13) {
            return z13;
        }
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            z11 = (i10 & 16) != 0;
            z12 = (i10 & 8) != 0;
            boolean z17 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z11 || z12 || z17 || z14) {
                z10 = z14;
                z14 = z17;
                eVar = this.f33774a.f33733a.f33720l;
                synchronized (eVar.f33688c) {
                    try {
                        eVar.f33691f = z11;
                        eVar.f33692g = z12;
                        eVar.f33693h = z14;
                        eVar.f33694i = z10;
                        if (z15) {
                            eVar.f33690e = true;
                            if (eVar.f33695j != null) {
                                eVar.a();
                            }
                        }
                        eVar.f33689d = z16;
                        pg.f0 f0Var = pg.f0.f21461a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            }
            if (i11 >= 34) {
                z10 = true;
                z14 = true;
            } else {
                z10 = z14;
                z14 = true;
            }
            z11 = z14;
        } else {
            z10 = false;
            z11 = true;
        }
        z12 = z11;
        eVar = this.f33774a.f33733a.f33720l;
        synchronized (eVar.f33688c) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pg.j] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f33781h;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) this.f33774a.f33733a.f33718j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f33781h;
        if (z10) {
            b(new z(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f33781h;
        if (z10) {
            b(new a0(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f33781h;
        if (!z10) {
            return z10;
        }
        b(new b0(i10, i11));
        return true;
    }
}
