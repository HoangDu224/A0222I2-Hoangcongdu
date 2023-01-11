function findByName() {
    let blogName = $("#blogname").val();
    console.log(blogName)
    $.ajax({
        url: "http://localhost:8080/restBlog/searchBlog",
        data: {
            name: blogName
        },
        type: "get",
        dataType: "json",
        success: function (data) {
            let result = '';
            for (let i = 0; i < data.length; i++) {
                result += `
                 <tr>
                        <td>
                                ${data[i].title}
                        </td>
                        <td>
                                <button onclick="deleteBlogAjax()" id="deleteId" value="${data[i].id}">Delete</button>
                        </td>
                  </tr>
                `;
            }
            $("#result").html(result);
        },
        error: function (e) {

        }
    });
}

function deleteBlogAjax() {
    let deleteId = $("#deleteId").val();
    console.log(deleteId)
    $.ajax({
        url: "http://localhost:8080/restBlog/deleteBlog",
        data: {
            name: deleteId
        },
        type: "get",
        dataType: "json",
        success: function (data) {
            let result = '';
            for (let i = 0; i < data.length; i++) {
                result += `
                 <tr>
                        <td>
                                ${data[i].title}
                        </td>
                        <td>
                            <button onclick="deleteBlogAjax()" id="deleteId" value="${data[i].id}"><a >Edit</a></button>
                        </td>
                  </tr>
                `;
            }
            $("#result").html(result);
        },
        error: function (e) {

        }
    });
}