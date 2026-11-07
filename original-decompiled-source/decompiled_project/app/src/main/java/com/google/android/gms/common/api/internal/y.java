package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class y implements OnCompleteListener, v2.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6069a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6070b;

    public y(z zVar, TaskCompletionSource taskCompletionSource) {
        this.f6070b = zVar;
        this.f6069a = taskCompletionSource;
    }

    @Override // v2.f
    public int E(int i10) {
        do {
            i10 = ((v2.g) this.f6070b).i(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f6069a).charAt(i10)));
        return i10;
    }

    @Override // v2.f
    public int F(int i10) {
        do {
            i10 = ((v2.g) this.f6070b).h(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f6069a).charAt(i10 - 1)));
        return i10;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((z) this.f6070b).f6073b.remove((TaskCompletionSource) this.f6069a);
    }

    @Override // v2.f
    public int w(int i10) {
        CharSequence charSequence = (CharSequence) this.f6069a;
        do {
            i10 = ((v2.g) this.f6070b).h(i10);
            if (i10 == -1 || i10 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i10)));
        return i10;
    }

    @Override // v2.f
    public int x(int i10) {
        do {
            i10 = ((v2.g) this.f6070b).i(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f6069a).charAt(i10 - 1)));
        return i10;
    }

    public y(ThreadPoolExecutor threadPoolExecutor) {
        this.f6070b = new p.a();
        this.f6069a = threadPoolExecutor;
    }

    public y(CharSequence charSequence, v2.g gVar) {
        this.f6069a = charSequence;
        this.f6070b = gVar;
    }
}
