package com.example.latihan7akb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihan7akb.R;
import com.example.latihan7akb.model.DaftarBalitaStanting;
import com.example.latihan7akb.model.ResponseModel;

import java.util.List;

//10119199, Iqbal Fatur Nugraha, 06 Juli 2022

public class BalitaStantingAdapter extends RecyclerView.Adapter {

    private List dbList;
    Context context;

    public BalitaStantingAdapter(Context context, List dbList){
        this.context = context;
        this.dbList = dbList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.table_list_item,parent,false);
        return new RowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RowViewHolder rowViewHolder = (RowViewHolder) holder;

        int rowPos = rowViewHolder.getAdapterPosition();

        if (rowPos == 0) {

            rowViewHolder.id.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.kodeProvinsi.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.namaProvinsi.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.kodeKabupatenKota.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.namaKabupatenKota.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.persentase_balita_stunting.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.satuan.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.tahun.setBackgroundResource(R.drawable.table_header_cell_bg);

            rowViewHolder.id.setText("ID");
            rowViewHolder.kodeProvinsi.setText("Kode Provinsi");
            rowViewHolder.namaProvinsi.setText("Nama Provinsi");
            rowViewHolder.kodeKabupatenKota.setText("Kode Kabupaten/Kota");
            rowViewHolder.namaKabupatenKota.setText("Nama Kabupaten/Kota");
            rowViewHolder.persentase_balita_stunting.setText("Persentase Balita Stunting");
            rowViewHolder.satuan.setText("Satuan");
            rowViewHolder.tahun.setText("Tahun");
        }else {
            DaftarBalitaStanting modal = (DaftarBalitaStanting) dbList.get(rowPos - 1);

            rowViewHolder.id.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.kodeProvinsi.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.namaProvinsi.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.kodeKabupatenKota.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.namaKabupatenKota.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.persentase_balita_stunting.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.satuan.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.tahun.setBackgroundResource(R.drawable.table_content_cell_bg);

            rowViewHolder.id.setText(modal.getId());
            rowViewHolder.kodeProvinsi.setText(modal.getKode_provinsi());
            rowViewHolder.namaProvinsi.setText(modal.getNama_provinsi());
            rowViewHolder.kodeKabupatenKota.setText(modal.getKode_kabupaten_kota());
            rowViewHolder.namaKabupatenKota.setText(modal.getNama_kabupaten_kota());
            rowViewHolder.persentase_balita_stunting.setText(modal.getPersentase_balita_stunting());
            rowViewHolder.satuan.setText(modal.getSatuan());
            rowViewHolder.tahun.setText(modal.getTahun());
        }
    }

    @Override
    public int getItemCount() {
        return dbList.size() +1;
    }

    public class RowViewHolder extends RecyclerView.ViewHolder {
        TextView id, kodeProvinsi, namaProvinsi, kodeKabupatenKota, namaKabupatenKota,persentase_balita_stunting, satuan, tahun;
        public RowViewHolder(@NonNull View view) {
            super(view);
            id =(TextView)view.findViewById(R.id.txtId);
            kodeProvinsi =(TextView)view.findViewById(R.id.txtKodeProv);
            namaProvinsi =(TextView)view.findViewById(R.id.txtNamaProv);
            kodeKabupatenKota =(TextView)view.findViewById(R.id.txtKodeKabKota);
            namaKabupatenKota =(TextView)view.findViewById(R.id.txtNamaKabKota);
            persentase_balita_stunting =(TextView)view.findViewById(R.id.txtPersen);
            satuan =(TextView)view.findViewById(R.id.txtSatuan);
            tahun =(TextView)view.findViewById(R.id.txtTahun);
        }
    }
}
