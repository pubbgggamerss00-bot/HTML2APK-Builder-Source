package x4;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.t;

/* loaded from: classes.dex */
public final class c implements androidx.lifecycle.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.l f32057a;

    public c(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.l lVar) {
        this.f32057a = lVar;
    }

    @Override // androidx.lifecycle.e
    public final void h(t tVar) {
        b.a(Looper.getMainLooper()).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.f32057a.c(this);
    }
}
