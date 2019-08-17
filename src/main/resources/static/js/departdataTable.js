// jQuery dataTable
// Ajax data
$(document).ready( function () {
     $('#departmentsTable thead tr').clone(true).appendTo( '#departmentsTable thead' );
     $('#departmentsTable thead tr:eq(1) th').each( function (i) {
         var title = $(this).text();
         $(this).html( '<input type="text" placeholder="Search '+title+'" />' );

         $( 'input', this ).on( 'keyup change', function () {
             if ( table.column(i).search() !== this.value ) {
                 table
                     .column(i)
                     .search( this.value )
                     .draw();
             }
         } );
     } );

	 var table = $('#departmentsTable').DataTable({
	    orderCellsTop: true,
	    fixedHeader: true,
			"sAjaxSource": "/departments",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
				  { "mData": "dnumber" },
				  { "mData": "dname"},
				  { "mData": "mgrstartdate" },
				  { "mData": "dlocation" },

			],
			"dom": "Bfrtip",
			"buttons": [
			    'columnsToggle'
			]

	 });

});
