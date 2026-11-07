package org.jf.dexlib2.rewriter;

import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.debug.EndLocal;
import org.jf.dexlib2.iface.debug.LocalInfo;
import org.jf.dexlib2.iface.debug.RestartLocal;
import org.jf.dexlib2.iface.debug.StartLocal;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public class DebugItemRewriter implements Rewriter<DebugItem> {
    protected final Rewriters rewriters;

    public class BaseRewrittenLocalInfoDebugItem<T extends DebugItem & LocalInfo> implements DebugItem, LocalInfo {
        protected T debugItem;

        public BaseRewrittenLocalInfoDebugItem(T t3) {
            this.debugItem = t3;
        }

        @Override // org.jf.dexlib2.iface.debug.DebugItem
        public int getCodeAddress() {
            return this.debugItem.getCodeAddress();
        }

        @Override // org.jf.dexlib2.iface.debug.DebugItem
        public int getDebugItemType() {
            return this.debugItem.getDebugItemType();
        }

        @Override // org.jf.dexlib2.iface.debug.LocalInfo
        public String getName() {
            return this.debugItem.getName();
        }

        @Override // org.jf.dexlib2.iface.debug.LocalInfo
        public String getSignature() {
            return this.debugItem.getSignature();
        }

        @Override // org.jf.dexlib2.iface.debug.LocalInfo
        public String getType() {
            return (String) RewriterUtils.rewriteNullable(DebugItemRewriter.this.rewriters.getTypeRewriter(), this.debugItem.getType());
        }
    }

    public class RewrittenEndLocal extends BaseRewrittenLocalInfoDebugItem<EndLocal> implements EndLocal {
        public RewrittenEndLocal(EndLocal endLocal) {
            super(endLocal);
        }

        @Override // org.jf.dexlib2.iface.debug.EndLocal
        public int getRegister() {
            return ((EndLocal) this.debugItem).getRegister();
        }
    }

    public class RewrittenRestartLocal extends BaseRewrittenLocalInfoDebugItem<RestartLocal> implements RestartLocal {
        public RewrittenRestartLocal(RestartLocal restartLocal) {
            super(restartLocal);
        }

        @Override // org.jf.dexlib2.iface.debug.RestartLocal
        public int getRegister() {
            return ((RestartLocal) this.debugItem).getRegister();
        }
    }

    public class RewrittenStartLocal extends BaseRewrittenLocalInfoDebugItem<StartLocal> implements StartLocal {
        public RewrittenStartLocal(StartLocal startLocal) {
            super(startLocal);
        }

        @Override // org.jf.dexlib2.iface.debug.StartLocal
        public StringReference getNameReference() {
            return ((StartLocal) this.debugItem).getNameReference();
        }

        @Override // org.jf.dexlib2.iface.debug.StartLocal
        public int getRegister() {
            return ((StartLocal) this.debugItem).getRegister();
        }

        @Override // org.jf.dexlib2.iface.debug.StartLocal
        public StringReference getSignatureReference() {
            return ((StartLocal) this.debugItem).getSignatureReference();
        }

        @Override // org.jf.dexlib2.iface.debug.StartLocal
        public TypeReference getTypeReference() {
            TypeReference typeReference = ((StartLocal) this.debugItem).getTypeReference();
            if (typeReference == null) {
                return null;
            }
            return RewriterUtils.rewriteTypeReference(DebugItemRewriter.this.rewriters.getTypeRewriter(), typeReference);
        }
    }

    public DebugItemRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public DebugItem rewrite(DebugItem debugItem) {
        int debugItemType = debugItem.getDebugItemType();
        return debugItemType != 3 ? debugItemType != 5 ? debugItemType != 6 ? debugItem : new RewrittenRestartLocal((RestartLocal) debugItem) : new RewrittenEndLocal((EndLocal) debugItem) : new RewrittenStartLocal((StartLocal) debugItem);
    }
}
