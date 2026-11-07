package com.basitce.htmltoapk.data.apkgenerator.binaryxml;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlDecoder;
import eh.p;
import java.util.Iterator;
import lh.g;
import lh.i;
import pg.f0;
import pg.q;
import vg.e;
import vg.h;

@e(c = "com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlDecoder$Element$descendants$1", f = "BinaryXmlDecoder.kt", l = {19, 20}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BinaryXmlDecoder$Element$descendants$1 extends h implements p<i<? super BinaryXmlDecoder.Element>, tg.e<? super f0>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BinaryXmlDecoder.Element this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryXmlDecoder$Element$descendants$1(BinaryXmlDecoder.Element element, tg.e<? super BinaryXmlDecoder$Element$descendants$1> eVar) {
        super(2, eVar);
        this.this$0 = element;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        BinaryXmlDecoder$Element$descendants$1 binaryXmlDecoder$Element$descendants$1 = new BinaryXmlDecoder$Element$descendants$1(this.this$0, eVar);
        binaryXmlDecoder$Element$descendants$1.L$0 = obj;
        return binaryXmlDecoder$Element$descendants$1;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        Iterator it;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.label;
        if (i10 == 0) {
            q.b(obj);
            i iVar2 = (i) this.L$0;
            BinaryXmlDecoder.Element element = this.this$0;
            this.L$0 = iVar2;
            this.label = 1;
            iVar2.c(element, this);
            return aVar;
        }
        if (i10 == 1) {
            i iVar3 = (i) this.L$0;
            q.b(obj);
            iVar = iVar3;
            it = this.this$0.getChildren().iterator();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            iVar = (i) this.L$0;
            q.b(obj);
        }
        while (it.hasNext()) {
            g<BinaryXmlDecoder.Element> gVarDescendants = ((BinaryXmlDecoder.Element) it.next()).descendants();
            this.L$0 = iVar;
            this.L$1 = it;
            this.label = 2;
            iVar.getClass();
            Object objE = iVar.e(gVarDescendants.iterator(), this);
            if (objE != ug.a.f29706a) {
                objE = f0.f21461a;
            }
            if (objE == aVar) {
                return aVar;
            }
        }
        return f0.f21461a;
    }

    @Override // eh.p
    public final Object invoke(i<? super BinaryXmlDecoder.Element> iVar, tg.e<? super f0> eVar) {
        return ((BinaryXmlDecoder$Element$descendants$1) create(iVar, eVar)).invokeSuspend(f0.f21461a);
    }
}
