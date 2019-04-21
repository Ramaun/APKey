package com.example.apkey.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apkey.Model.InstansiItem;
import com.example.apkey.R;
import java.util.List;

public class InstansiAdapter extends RecyclerView.Adapter<InstansiAdapter.Holder> {

    private List<InstansiItem> instansiList;
    private Context context;

    public InstansiAdapter(Context context, List<InstansiItem> instansiList) {
        this.context = context;
        this.instansiList = instansiList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_instansi, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(InstansiAdapter.Holder holder, final int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return instansiList.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        private TextView tvId, tvIdKabupaten, tvNamaKabupaten, tvJenisInstansi, tvNamaInstansi, tvNomorInstansi, tvAlamatInstansi;

        public Holder(View itemView) {
            super(itemView);

            tvId = itemView.findViewById(R.id.tv_item_id);
            tvIdKabupaten = itemView.findViewById(R.id.tv_item_id_kabupaten);
            tvNamaKabupaten = itemView.findViewById(R.id.tv_item_nama_kabupaten);
            tvJenisInstansi = itemView.findViewById(R.id.tv_item_jenis_instansi);
            tvNamaInstansi = itemView.findViewById(R.id.tv_nama_instansi);
            tvNomorInstansi = itemView.findViewById(R.id.tv_item_nomor_instansi);
            tvAlamatInstansi = itemView.findViewById(R.id.tv_item_alamat_instansi);
        }

        public void bind(final int position) {
            tvId.setText(instansiList.get(position).getId());
            tvIdKabupaten.setText(instansiList.get(position).getIdKabupaten());
            tvNamaKabupaten.setText(instansiList.get(position).getNamaKabupaten());
            tvJenisInstansi.setText(instansiList.get(position).getJenisInstansi());
            tvNamaInstansi.setText(instansiList.get(position).getNamaInstansi());
            tvNomorInstansi.setText(instansiList.get(position).getNomorInstansi());
            tvAlamatInstansi.setText(instansiList.get(position).getAlamatInstansi());
        }
    }
}
